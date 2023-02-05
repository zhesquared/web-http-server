package ru.netology;

import ru.netology.server.Server;
import ru.netology.server.Utils;

import java.io.IOException;
import java.time.LocalDateTime;

public class Main {

    final static int PORT = 9999;
    final static int NUMBER_OF_THREADS = 64;

    public static void main(String[] args) {
        Server server = new Server(PORT, NUMBER_OF_THREADS);

        server.addHandler("GET", "/index.html", (request, out) -> {
            var path = "/index.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/index.html", (request, out) -> {
            var path = "/index.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("GET", "/classic.html", (request, out) -> {
            var path = "/classic.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/classic.html", (request, out) -> {
            var path = "/classic.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("GET", "/events.html", (request, out) -> {
            var path = "/events.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/events.html", (request, out) -> {
            var path = "/events.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("GET", "/events.js", (request, out) -> {
            var path = "/events.js";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/events.js", (request, out) -> {
            var path = "/events.js";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("GET", "/resources.html", (request, out) -> {
            var path = "/resources.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/resources.html", (request, out) -> {
            var path = "/resources.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("GET", "/spring.png", (request, out) -> {
            var path = "/spring.png";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/spring.png", (request, out) -> {
            var path = "/spring.png";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("GET", "/spring.svg", (request, out) -> {
            var path = "/spring.svg";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/spring.svg", (request, out) -> {
            var path = "/spring.svg";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("GET", "/styles.css", (request, out) -> {
            var path = "/styles.css";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/styles.css", (request, out) -> {
            var path = "/styles.css";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("GET", "/links.html", (request, out) -> {
            var path = "/links.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/links.html", (request, out) -> {
            var path = "/links.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("GET", "/forms.html", (request, out) -> {
            var path = "/forms.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/forms.html", (request, out) -> {
            var path = "/forms.html";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("GET", "/app.js", (request, out) -> {
            var path = "/app.js";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.addHandler("POST", "/app.js", (request, out) -> {
            var path = "/app.js";
            final var filePath = Utils.getFilePath(path);
            final var content = Utils.getTemplate(filePath).replace(
                    "{time}",
                    LocalDateTime.now().toString()
            ).getBytes();

            try {
                out.write((
                        "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: " + Utils.getMimeType(filePath) + "\r\n" +
                                "Content-Length: " + content.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n"
                ).getBytes());
                out.write(content);
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        server.start();
    }
}