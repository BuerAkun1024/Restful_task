package com.example.restful.pojo;


import java.sql.Timestamp;

public class Task {

    private int id;

    private String content;

    private java.sql.Timestamp createdTime;

    public Task(){
    }

    public Task(int id, String content,java.sql.Timestamp createdTime) {
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

    public java.sql.Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(java.sql.Timestamp createdTime) {
        this.createdTime = createdTime;
    }
}

