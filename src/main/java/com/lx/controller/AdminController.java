package com.lx.controller;

import com.lx.pojo.User;
import com.lx.service.AdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping("/login")
    @ResponseBody
    @ApiOperation(value="该方法的作用是登陆,返回json字符串，登陆成功，返回success,失败返回false")
    public String login(User user) {
        boolean result = adminService.login(user);
        if (result) {
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping("/register")
    @ResponseBody
    @ApiOperation(value ="该方法的作用是注册")
    public String register(User user) {
        adminService.register(user);
        return "/login";
    }
}
