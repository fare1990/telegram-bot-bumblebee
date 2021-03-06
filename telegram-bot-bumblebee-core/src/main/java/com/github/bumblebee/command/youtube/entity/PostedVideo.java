package com.github.bumblebee.command.youtube.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Fare on 25.11.2016.
 */
@Entity
@Table(name = "BB_YOUTUBE_POSTED_VIDEOS")
public class PostedVideo {

    @Id
    private String videoId;
    private Date postedDate;

    @SuppressWarnings("unused")
    public PostedVideo() {
    }

    public PostedVideo(String videoId, Date postedDate) {
        this.videoId = videoId;
        this.postedDate = postedDate;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }
}
