package ru.netology.server;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private final int port;
    private final int numberOfThreads;
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, Handler>> handlers = new ConcurrentHashMap<>();

    public Server(int port, int numberOfThreads) {
        this.port = port;
        this.numberOfThreads = numberOfThreads;
    }

    public void start() {
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        try (var serverSocket = new ServerSocket(port)) {
            while (true) {
                var socket = serverSocket.accept();
                executor.execute(() -> handle(socket));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void handle(Socket socket) {
        try (
                var in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                var out = new BufferedOutputStream(socket.getOutputStream())
        ) {

            final var requestLine = in.readLine();
            final var parts = requestLine.split(" ");
            Request request = new Request(parts[0], parts[1]);

            if (parts.length != 3) {
                return;
            }

            var methodMap = handlers.get(request.getMethod());

            if (methodMap == null) {
                Responce.sendBadRequest(out);
                return;
            }

            var handler = methodMap.get(request.getURI());

            if (handler == null) {
                Responce.sendBadRequest(out);
                return;
            }

            handler.handle(request, out);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void addHandler(String method, String path, Handler handler) {
        handlers.putIfAbsent(method, new ConcurrentHashMap<>());

        var methodMap = handlers.get(method);
        methodMap.put(path, handler);
    }
}
