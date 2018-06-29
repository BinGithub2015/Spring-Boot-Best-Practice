package com.example.template.common.model.request;

/**
 * @author bin
 */
public class Request {
    private String timestamp;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Request{" +
                "timestamp='" + timestamp + '\'' +
                '}';
    }
}
