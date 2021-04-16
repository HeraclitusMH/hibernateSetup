package com.almaviva.service.greeting;

import javax.persistence.*;
public class Greeting {

    private long greetingid;
    private String content;

    public Greeting(long id, String content) {
        this.greetingid = id;
        this.content = content;
    }

    public Greeting() { }

    public long getId() {
        return greetingid;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id){ this.greetingid = id; }

    public void setContent(String content) { this.content = content; }
}
