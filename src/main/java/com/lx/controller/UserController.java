package com.lx.controller;


import com.lx.pojo.User;
import com.lx.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
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
    public String login(User user) {
        boolean result = userService.login(user);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * 注册接口
     * @param user
     * @return
     */
    @RequestMapping("/register")
    @ApiOperation(value = "注册接口")
    public String register(User user) {
        userService.register(user);
        return "index";
    }

    /**
     * 注册时验证手机号是否已经存在
     * @param phoneNumber
     * @return
     */
    @RequestMapping("/validatePhoneNum")
    @ApiOperation(value = "注册时验证手机号是否存在接口")
    public String validatePhoneNum(String phoneNumber) {
        boolean result = userService.validatePhoneNum(phoneNumber);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }
}
