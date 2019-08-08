package com.blog.personalblog.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.blog.personalblog.pojo.User;

import java.util.Date;

public class JWTUtils {
    public String getToken(User user) {
        Date start = new Date();
        long currentTime = System.currentTimeMillis() + 60* 60 * 1000;//一小时有效时间
        Date end = new Date(currentTime);
        String token="";
        token= JWT.create().withAudience(user.getUserEmail())
                .withIssuedAt(start).withExpiresAt(end)
                .sign(Algorithm.HMAC256(user.getUserName()));
        return token;
    }
}
