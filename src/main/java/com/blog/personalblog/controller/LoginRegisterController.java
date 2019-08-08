package com.blog.personalblog.controller;

import com.blog.personalblog.annotations.UserLoginToken;
import com.blog.personalblog.pojo.User;
import com.blog.personalblog.service.UserService;
import com.blog.personalblog.util.JWTUtils;
import com.blog.personalblog.util.MyResult;
import com.blog.personalblog.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:8000",allowCredentials = "true")
public class LoginRegisterController {
    @Autowired
    private UserService userService;
    JWTUtils jwtUtils = new JWTUtils();
    /**
     * 注册用户
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public MyResult<String> Register(@RequestBody User user){
        System.out.println("注册用户");
        try{
            return ResultUtil.success(userService.register(user));
        }catch (Exception e){
            return ResultUtil.error(500,e.getMessage());
        }

    }
    @RequestMapping("/login")
    public MyResult<String> Login(@RequestBody User user){
        ModelMap modelMap = new ModelMap();
        User userForBase=userService.login(user.getUserEmail(),user.getUserPwd());
        if(userForBase==null){
            return ResultUtil.error(500,"登录失败，用户不存在 或 密码错误");
        }else {
            String token =jwtUtils.getToken(userForBase);
            try {
                modelMap.addAttribute("token", token);
                modelMap.addAttribute("user", userForBase);
                return ResultUtil.success(modelMap);
            } catch (RuntimeException e) {
                e.printStackTrace();
                return ResultUtil.error(500,e.getMessage());
            }
        }
    }

    /**
     * 查询邮箱是否存在
     * @param userEmail
     * @return
     */
    @RequestMapping("/queryUserByEmail")
    public MyResult<User> queryUserByEmail(@RequestParam(value = "userEmail") String userEmail){
        try{
            return ResultUtil.success(userService.queryUserByEmail(userEmail));
        }
        catch (Exception e){
            return ResultUtil.error(500,e.getMessage());
        }

    }
    @RequestMapping("/canRegisterEmail")
    public MyResult canRegisterEmail(@RequestParam(value = "userEmail") String userEmail){
        try{
            return ResultUtil.success(userService.canRegisterEmail(userEmail));
        }
        catch (Exception e){
            return ResultUtil.error(500,e.getMessage());
        }
    }
    @UserLoginToken
    @GetMapping("/getMessage")
    public MyResult getMessage(){
        return ResultUtil.success("你已经通过验证");
    }
}
