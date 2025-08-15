package com.example.group12_bksp.Mansura;

public class EventCmodel4 {

    private int feedbackId;
    private String author;
    private String content;

    // Constructor
    public EventCmodel4(int feedbackId, String author, String content) {
        this.feedbackId = feedbackId;
        this.author = author;
        this.content = content;
    }

    // Getters and Setters
    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
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

    // toString
    @Override
    public String toString() {
        return "EventCmodel4{" +
                "feedbackId=" + feedbackId +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

