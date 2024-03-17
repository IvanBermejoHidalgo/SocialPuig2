package com.example.socialpuig;

public class Comment {
    public String uid;
    public String author;
    public String comment;
    public long timeStamp;

    public Comment() {}

    public Comment(String uid, String author, String comment, long timeStamp) {
        this.uid = uid;
        this.author = author;
        this.comment = comment;
        this.timeStamp = timeStamp;
    }
}