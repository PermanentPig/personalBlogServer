package com.blog.personalblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.blog.personalblog.mapper")
@SpringBootApplication
public class PersonalblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalblogApplication.class, args);
    }

}
