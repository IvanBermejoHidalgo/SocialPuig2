package com.example.socialpuig;

public class Comment {
    public String uid;
    public String author;
    public String content;
    public long timeStamp;

    public Comment() {}

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Comment(String uid, String author, String content) {
        this.uid = uid;
        this.author = author;
        this.content = content;
        this.timeStamp = timeStamp;
    }
}