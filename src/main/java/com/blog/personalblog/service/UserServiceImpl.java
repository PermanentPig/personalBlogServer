package com.blog.personalblog.service;

import com.blog.personalblog.mapper.UserMapper;
import com.blog.personalblog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {

        return userMapper.getUsers();
    }

    @Override
    public int register(User user) {
        user.setUserCreateTime(new Date());
        return userMapper.register(user);
    }
    @Override
    public List<User> queryUserByEmail(String userEmail){
        return userMapper.queryUserByEmail(userEmail);
    }

    @Override
    public Boolean canRegisterEmail(String userEmail) {
        if(userMapper.queryUserByEmail(userEmail).size()>0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public User login(String userEmail, String userPwd) {
        return userMapper.login(userEmail,userPwd);
    }
}
