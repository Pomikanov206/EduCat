package com.example.model;

public class Lecture {
    private String title;
    private String description;
    private String videoUrl;
    private String theoryUrl;
    private int order;

    public Lecture() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getTheoryUrl() {
        return theoryUrl;
    }

    public void setTheoryUrl(String theoryUrl) {
        this.theoryUrl = theoryUrl;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
