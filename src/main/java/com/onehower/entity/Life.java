package com.onehower.entity;

import java.time.LocalDateTime;

public class Life {
    private Long id;
    private String title;
    private String breif;
    private String content;
    private String pictures;
    private String audio;
    private String vedio;
    private LocalDateTime ctime;
    private LocalDateTime utime;

    public Life() {
    }

    public Life(String title, String breif, String content, String pictures, String audio, String vedio) {
        this.title = title;
        this.breif = breif;
        this.content = content;
        this.pictures = pictures;
        this.audio = audio;
        this.vedio = vedio;
    }

    public Life(String title, String breif, String content, String pictures, String audio, String vedio, LocalDateTime ctime, LocalDateTime utime) {
        this.title = title;
        this.breif = breif;
        this.content = content;
        this.pictures = pictures;
        this.audio = audio;
        this.vedio = vedio;
        this.ctime = ctime;
        this.utime = utime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBreif() {
        return breif;
    }

    public void setBreif(String breif) {
        this.breif = breif;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "Life{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", breif='" + breif + '\'' +
                ", content='" + content + '\'' +
                ", pictures='" + pictures + '\'' +
                ", audio='" + audio + '\'' +
                ", vedio='" + vedio + '\'' +
                ", ctime=" + ctime +
                ", utime=" + utime +
                '}';
    }
}
