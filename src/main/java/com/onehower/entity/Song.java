package com.onehower.entity;

import java.time.LocalDateTime;

public class Song {
    private Long id;
    private String name;
    private String singer;
    private String audio;
    private String lyric;
    private String thumbnail;
    private LocalDateTime ctime;
    private LocalDateTime utime;

    public Song() {
    }

    public Song(String name, String singer, String audio, String lyric, String thumbnail) {
        this.name = name;
        this.singer = singer;
        this.audio = audio;
        this.lyric = lyric;
        this.thumbnail = thumbnail;
    }

    public Song(Long id, String name, String singer, String audio, String lyric, String thumbnail, LocalDateTime ctime, LocalDateTime utime) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.audio = audio;
        this.lyric = lyric;
        this.thumbnail = thumbnail;
        this.ctime = ctime;
        this.utime = utime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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
}
