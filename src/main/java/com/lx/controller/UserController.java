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
}
