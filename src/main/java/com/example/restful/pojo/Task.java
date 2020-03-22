package com.example.restful.pojo;

import java.text.SimpleDateFormat;

public class Task {

    private int id;

    private String content;

    private SimpleDateFormat createdTime;

    public Task(){
    }

    public Task(int id, String content,SimpleDateFormat createdTime) {
        super();
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public SimpleDateFormat getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(SimpleDateFormat createdTime) {
        this.createdTime = createdTime;
    }
}

