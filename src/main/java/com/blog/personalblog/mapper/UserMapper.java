package com.blog.personalblog.mapper;

import com.blog.personalblog.pojo.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(column = "user_name",property = "userName"),
            @Result(column = "user_age",property = "userAge"),
            @Result(column = "user_pwd",property = "userPwd"),
    })
    List<User> getUsers();
}
