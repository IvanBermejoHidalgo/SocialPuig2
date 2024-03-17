package com.example.socialpuig;

import org.w3c.dom.Comment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Post {
    public String uid;
    public String idautor;
    public String author;
    public String authorPhotoUrl;
    public String content;
    public String mediaUrl;
    public String mediaType;
    public Map<String, Boolean> likes = new HashMap<>();
    public Map<String, Boolean> retweet = new HashMap<>();

    public List<Comment> comments;

    public long timeStamp;
    // Constructor vacio requerido por Firestore
    public Post() {}
    public Post(String uid, String idautor,String author, String authorPhotoUrl, String
            content, long timeStamp, String mediaUrl, String mediaType) {
        this.uid = uid;
        this.idautor = idautor;
        this.author = author;
        this.authorPhotoUrl = authorPhotoUrl;
        this.content = content;
        this.mediaUrl = mediaUrl;
        this.mediaType = mediaType;
        this.timeStamp = timeStamp;
    }
}