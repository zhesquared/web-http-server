package ru.netology.server;

public class Request {

    private String method;
    private String URI;
    private String headers;
    private String body;

    public Request(String method, String URI) {
        this.method = method;
        this.URI = URI;
    }

    public String getMethod() {
        return method;
    }

    public String getURI() {
        return URI;
    }

    public String getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }
}
