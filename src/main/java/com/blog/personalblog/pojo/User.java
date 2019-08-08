package com.blog.personalblog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userId;
    private String userName;
    private String userPwd;
    private String userEmail;
    private String userPhone;
    private String userHobby;
    private String userSkill;
    private String userWork;
    private Date userCreateTime;
    private Date userModifyTime;
    private String userDescription;
    private String userAddress;
}
