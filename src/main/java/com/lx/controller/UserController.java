package com.lx.controller;


import com.lx.pojo.User;
import com.lx.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
//@CrossOrigin//允许跨域的解决方案
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 登录接口
     * @param user
     * @return
     */
    @RequestMapping("/login")
    @ApiOperation(value = "登录接口")
    public String login(User user, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        boolean result = userService.login(user);
        if (result) {
            return "1";
        } else {
            return "0";
        }
    }

    /**
     * 注册接口
     * @param user
     * @return
     */
    @RequestMapping("/register")
    @ApiOperation(value = "注册接口")
    public String register(User user, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        userService.register(user);
        return "1";
    }

    /**
     * 注册时验证手机号是否已经存在
     * @param phoneNumber
     * @return
     */
    @RequestMapping("/validatePhoneNum")
    @ApiOperation(value = "注册时验证手机号是否存在接口")
    public String validatePhoneNum(String phoneNumber, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        boolean result = userService.validatePhoneNum(phoneNumber);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * 注册时验证用户名是否已经存在
     * @param name
     * @return
     */
    @RequestMapping("/validateName")
    @ApiOperation(value = "注册时验证用户名是否存在接口")
    public String validateName(String name, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        boolean result = userService.validateName(name);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * 更换密码时验证旧密码是否正确
     * @param password
     * @return
     *//*
    @RequestMapping("/validatePassword")
    @ApiOperation(value = "更换密码时验证旧密码是否正确接口")
    public String validatePassword(String password, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        boolean result = userService.validatePassword(password);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }*/

    @RequestMapping("/updatePassword")
    @ApiOperation(value = "更换密码接口")
    public String updatePassword(String password, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        userService.updatePassword(password);
        return "1";
    }
}
