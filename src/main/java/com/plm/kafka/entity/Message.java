package com.plm.kafka.entity;

import java.io.Serializable;

/**
 * @author crystal
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 6969242507194782000L;

    private String from;

    private String message;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message() {

    }

    public Message(String from, String message) {
        this.from = from;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
