package com.blog.personalblog.mapper;

import com.blog.personalblog.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM tb_user")
    @Results({
            @Result(column = "user_name",property = "userName"),
            @Result(column = "user_age",property = "userAge"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "user_email",property = "userEmail"),
            @Result(column = "user_phone",property = "userPhone"),
            @Result(column = "user_hobby",property = "userHobby"),
            @Result(column = "user_skill",property = "userSkill"),
            @Result(column = "user_work",property = "userWork"),
            @Result(column = "user_create_time",property = "userCreateTime"),
            @Result(column = "user_modify_time",property = "userModifyTime"),
            @Result(column = "user_description",property = "userDescription"),
            @Result(column = "user_address",property = "userAddress"),
    })
    List<User> getUsers();
    @Insert({"insert into tb_user(user_email,user_pwd,user_name,user_create_time) values(#{userEmail},#{userPwd},#{userName},#{userCreateTime})"})
    @Options(useGeneratedKeys=true, keyProperty="userId", keyColumn="user_id")
    int register(User user);
    @Select("select * from tb_user where user_email = #{userEmail}")
    @Results({
            @Result(column = "user_name",property = "userName"),
            @Result(column = "user_age",property = "userAge"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "user_email",property = "userEmail"),
            @Result(column = "user_phone",property = "userPhone"),
            @Result(column = "user_hobby",property = "userHobby"),
            @Result(column = "user_skill",property = "userSkill"),
            @Result(column = "user_work",property = "userWork"),
            @Result(column = "user_create_time",property = "userCreateTime"),
            @Result(column = "user_modify_time",property = "userModifyTime"),
            @Result(column = "user_description",property = "userDescription"),
            @Result(column = "user_address",property = "userAddress"),
    })
    List<User> queryUserByEmail( String userEmail);
    @Select("select * from tb_user where user_email = #{userEmail} and user_pwd = #{userPwd}")
    @Results({
            @Result(column = "user_name",property = "userName"),
            @Result(column = "user_age",property = "userAge"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "user_email",property = "userEmail"),
            @Result(column = "user_phone",property = "userPhone"),
            @Result(column = "user_hobby",property = "userHobby"),
            @Result(column = "user_skill",property = "userSkill"),
            @Result(column = "user_work",property = "userWork"),
            @Result(column = "user_create_time",property = "userCreateTime"),
            @Result(column = "user_modify_time",property = "userModifyTime"),
            @Result(column = "user_description",property = "userDescription"),
            @Result(column = "user_address",property = "userAddress"),
    })
    User login(String userEmail,String userPwd);
}
