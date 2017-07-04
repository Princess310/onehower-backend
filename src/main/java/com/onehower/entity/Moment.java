package com.onehower.entity;

import java.time.LocalDateTime;

public class Moment {
    private Long id;
    private String type;
    private String content;
    private String article;
    private String pictures;
    private String audio;
    private String vedio;
    private String tags;
    private LocalDateTime ctime;
    private LocalDateTime utime;

    public Moment() {
    }

    public Moment(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public Moment(String type, String content, String article, String pictures) {
        this.type = type;
        this.content = content;
        this.article = article;
        this.pictures = pictures;
    }

    public Moment(Long id, String type, String content, String article, String pictures, String audio, String vedio, String tags, LocalDateTime ctime, LocalDateTime utime) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.article = article;
        this.pictures = pictures;
        this.audio = audio;
        this.vedio = vedio;
        this.tags = tags;
        this.ctime = ctime;
        this.utime = utime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getVedio() {
        return vedio;
    }

    public void setVedio(String vedio) {
        this.vedio = vedio;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public LocalDateTime getCtime() {
        return ctime;
    }

    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    public LocalDateTime getUtime() {
        return utime;
    }

    public void setUtime(LocalDateTime utime) {
        this.utime = utime;
    }

    @Override
    public String toString() {
        return "Moment{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", article='" + article + '\'' +
                ", pictures='" + pictures + '\'' +
                ", audio='" + audio + '\'' +
                ", vedio='" + vedio + '\'' +
                ", tags='" + tags + '\'' +
                ", ctime=" + ctime +
                ", utime=" + utime +
                '}';
    }
}
