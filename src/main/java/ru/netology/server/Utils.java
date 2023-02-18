package ru.netology.server;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Utils {

    public static Path getFilePath (String path) {
        return Path.of(".", "public", path);
    }

    public static String getTemplate(Path filePath) throws IOException {
        return Files.readString(filePath);
    }

    public static String getMimeType(Path template) throws IOException {
        return Files.probeContentType(template);
    }

    public static void getBody() {

    }
}
