package com.blog.personalblog.controller;

import com.blog.personalblog.pojo.User;
import com.blog.personalblog.util.MyResult;
import com.blog.personalblog.util.ResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal")
public class PersonalMessageController {
    @RequestMapping("/getuser")
    public MyResult<User> getUser(){
        //TODO
        return ResultUtil.success();
    }
    @RequestMapping("/modifyuser")
    public MyResult<String> modifyUser(){
        //TODO
        return ResultUtil.success();
    }
}
