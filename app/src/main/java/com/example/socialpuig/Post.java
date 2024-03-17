package com.example.socialpuig;

import org.w3c.dom.Comment;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Post implements Serializable {
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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getIdautor() {
        return idautor;
    }

    public void setIdautor(String idautor) {
        this.idautor = idautor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorPhotoUrl() {
        return authorPhotoUrl;
    }

    public void setAuthorPhotoUrl(String authorPhotoUrl) {
        this.authorPhotoUrl = authorPhotoUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Map<String, Boolean> getLikes() {
        return likes;
    }

    public void setLikes(Map<String, Boolean> likes) {
        this.likes = likes;
    }

    public Map<String, Boolean> getRetweet() {
        return retweet;
    }

    public void setRetweet(Map<String, Boolean> retweet) {
        this.retweet = retweet;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

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