package com.onehower.entity;

import java.time.LocalDateTime;

public class Message {
    private Long id;
    private String username;
    private String email;
    private String avatar;
    private String content;
    private String ip;
    private LocalDateTime ctime;
    private LocalDateTime utime;

    public Message() {
    }

    public Message(String username, String email, String avatar, String content, String ip) {
        this.username = username;
        this.email = email;
        this.avatar = avatar;
        this.content = content;
        this.ip = ip;
    }

    public Message(String username, String email, String avatar, String content, String ip, LocalDateTime ctime, LocalDateTime utime) {
        this.username = username;
        this.email = email;
        this.avatar = avatar;
        this.content = content;
        this.ip = ip;
        this.ctime = ctime;
        this.utime = utime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
        return "Message{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", content='" + content + '\'' +
                ", ip='" + ip + '\'' +
                ", ctime=" + ctime +
                ", utime=" + utime +
                '}';
    }
}
