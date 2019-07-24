package com.blog.personalblog.service;

import com.blog.personalblog.mapper.UserMapper;
import com.blog.personalblog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getUsers();
    }
}
