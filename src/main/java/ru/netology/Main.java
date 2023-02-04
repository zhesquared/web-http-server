package ru.netology;


import ru.netology.server.Server;

import java.util.List;

public class Main {

    final static int PORT = 9999;
    final static int NUMBER_OF_THREADS = 64;

    public static void main(String[] args) {
        final var validPaths = List.of("/index.html", "/spring.svg", "/spring.png",
                "/resources.html", "/styles.css", "/app.js", "/links.html", "/forms.html",
                "/classic.html", "/events.html", "/events.js");

        Server server = new Server(validPaths, PORT, NUMBER_OF_THREADS);
        server.start();
    }
}