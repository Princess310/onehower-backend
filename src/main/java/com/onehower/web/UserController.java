package com.onehower.web;

import com.onehower.entity.User;
import com.onehower.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.getList();
    }

    @ApiOperation(value = "创建用户", notes = "根据用户对象创建用户")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Long add(@ModelAttribute User user) {
        Long id = userService.addUser(user.getName(), user.getPassword(), user.getAvatar(), user.getIsAdmin(), LocalDateTime.now(), LocalDateTime.now());

        return id;
    }
}
