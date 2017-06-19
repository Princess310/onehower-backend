package com.onehower.service;

import com.onehower.entity.User;
import com.onehower.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getList() {
        return userMapper.getList();
    }

    public Long addUser(String name, String password, String avatar, Boolean isAdmin, LocalDateTime ctine, LocalDateTime utime) {
        return userMapper.insert(name, password, avatar, isAdmin, ctine, utime);
    }
}
