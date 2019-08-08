package com.blog.personalblog.service;

import com.blog.personalblog.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> getAll();

    /**
     * 注册用户
     * @param user
     * @return
     */
    int register(User user);

    /**
     * 通过邮箱查询用户
     * @param userEmail
     * @return
     */
    List<User> queryUserByEmail(String userEmail);

    /**
     * 查询邮箱是否已经存在
     * @param userEmail
     * @return
     */
    Boolean canRegisterEmail(String userEmail);

    /**
     * 登录用户
     * @param userEmail
     * @param userPwd
     * @return
     */
    User login(String userEmail,String userPwd);
}
