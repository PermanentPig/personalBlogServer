package com.blog.personalblog.controller;

import com.blog.personalblog.pojo.User;
import com.blog.personalblog.service.UserService;
import com.blog.personalblog.util.MyResult;
import com.blog.personalblog.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8000",allowCredentials = "true")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getusers")
    MyResult<User> getUsers(){
        System.out.println("查询所有用户");
        return ResultUtil.success(userService.getAll());
    }

}
