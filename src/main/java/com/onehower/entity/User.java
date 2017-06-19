package com.onehower.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.LocalDateTime;

public class User {

    private Long id;
    private String name;
    private String password;
    private String avatar;
    private Boolean isAdmin;
    private LocalDateTime ctime;
    private LocalDateTime utime;

    public User() {}

    public User(String name, String password, String avatar, Boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.avatar = avatar;
        this.isAdmin = isAdmin;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
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
