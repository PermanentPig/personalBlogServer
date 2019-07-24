package com.blog.personalblog.controller;

import com.blog.personalblog.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world2222ddddd";
    }
    @RequestMapping("/getstudents")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("sunheng",25,"成都"));
        students.add(new Student("miaomiao",23,"绵阳"));
        students.add(new Student("陈宇",11,"乐山"));
        return  students;
    }
}
