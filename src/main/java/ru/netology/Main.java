package ru.netology;

import ru.netology.server.Responce;
import ru.netology.server.Server;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class Main {

    final static int PORT = 9999;
    final static int NUMBER_OF_THREADS = 64;

    public static void main(String[] args) {
        Server server = new Server(PORT, NUMBER_OF_THREADS);

        server.addHandler("GET", "/index.html",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    byte[] content = Files.readAllBytes(filePath);
                    Responce.sendOk(filePath, content, out);
                });

        server.addHandler("GET", "/classic.html",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    String content = Files.readString(filePath);
                    byte[] newContent = content
                            .replace("{time}",
                                    LocalDateTime.now().toString())
                            .getBytes();
                    Responce.sendOk(filePath, newContent, out);
                });

        server.addHandler("GET", "/events.html",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    byte[] content = Files.readAllBytes(filePath);
                    Responce.sendOk(filePath, content, out);
                });

        server.addHandler("GET", "/events.js",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    byte[] content = Files.readAllBytes(filePath);
                    Responce.sendOk(filePath, content, out);
                });

        server.addHandler("GET", "/resources.html",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    byte[] content = Files.readAllBytes(filePath);
                    Responce.sendOk(filePath, content, out);
                });

        server.addHandler("GET", "/spring.png",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    byte[] content = Files.readAllBytes(filePath);
                    Responce.sendOk(filePath, content, out);
                });

        server.addHandler("GET", "/spring.svg",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    byte[] content = Files.readAllBytes(filePath);
                    Responce.sendOk(filePath, content, out);
                });

        server.addHandler("GET", "/styles.css",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    byte[] content = Files.readAllBytes(filePath);
                    Responce.sendOk(filePath, content, out);
                });

        server.addHandler("GET", "/links.html",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    byte[] content = Files.readAllBytes(filePath);
                    Responce.sendOk(filePath, content, out);
                });

        server.addHandler("GET", "/forms.html",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    byte[] content = Files.readAllBytes(filePath);
                    Responce.sendOk(filePath, content, out);
                });

        server.addHandler("GET", "/app.js",
                (request, out) -> {
                    Path filePath = Path.of(".", "/public", request.getPath());
                    byte[] content = Files.readAllBytes(filePath);
                    Responce.sendOk(filePath, content, out);
                });


        server.start();
    }
}