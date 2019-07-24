package com.blog.personalblog.controller;

import com.blog.personalblog.pojo.User;
import com.blog.personalblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getusers")
    List<User> getUsers(){
        System.out.println("查询所有用户");
        return userService.getAll();
    }

}
