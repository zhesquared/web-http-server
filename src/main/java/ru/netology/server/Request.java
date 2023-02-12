package ru.netology.server;

import org.apache.http.NameValuePair;

import java.util.List;

public class Request {

    private String method;
    private String path;
    private List<NameValuePair> queryParams;
    private List<String> headers;
    private String body;
    private String URI;

    public Request(String method, String URI) {
        this.method = method;
        this.URI = URI;
    }

    public Request() {

    }

    public String getMethod() {
        return method;
    }

    public String getURI() {
        return URI;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    public String getPath() {
        return path;
    }

    public List<NameValuePair> queryParams() {
        return queryParams;
    }

    public String getQueryParam(String name) {
        for (NameValuePair queryParam : queryParams()) {
            if (name.equals(queryParam.getName())) {
                return queryParam.getValue();
            }
        }
        System.out.println("There is no such query parameter");
        return null;
    }

    public void setQueryParams(List<NameValuePair> queryParams) {
        this.queryParams = queryParams;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
