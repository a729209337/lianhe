package com.lx.controller;


import com.lx.pojo.ShopAddress;
import com.lx.pojo.User;
import com.lx.service.UserService;
import com.lx.utils.UUIDUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin//允许跨域的解决方案
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 登录接口
     * @param user
     * @return
     */
    @RequestMapping("/login")
    @ApiOperation(value = "登录接口, 1表示成功、0表示失败")
    public String login(User user) {
        boolean result = userService.login(user);
       String str = null;

        if (result) {
         str  = UUIDUtils.creatUUID();
         user.setToken(str);
         userService.updateToken(user);
            return str;
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
    public String register(User user) {
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
    public String validatePhoneNum(String phoneNumber) {
        boolean result = userService.validatePhoneNum(phoneNumber);
        if (result) {
            return "1";
        } else {
            return "0";
        }
    }

    /**
     * 注册时验证用户名是否已经存在
     * @param name
     * @return
     */
    @RequestMapping("/validateName")
    @ApiOperation(value = "注册时验证用户名是否存在接口")
    public String validateName(String name) {
        boolean result = userService.validateName(name);
        if (result) {
            return "1";
        } else {
            return "0";
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

    /**
     * 更换密码接口
     * @param password
     * @return
     */
    @RequestMapping("/updatePassword")
    @ApiOperation(value = "更换密码接口")
    public String updatePassword(String password, String phoneNumber) {
        User user = new User();
        user.setPhoneNumber(phoneNumber);
        user.setPassword(password);
        userService.updatePassword(user);
        return "1";
    }

    /**
     * 展示用户热评
     * @return
     */
    @RequestMapping("/showAppraise")
    @ApiOperation(value = "展示用户热评")
    public List<User> showAppraise() {
        List<User> userList =userService.showAppraise();
        return userList;
    }

    @RequestMapping("/insertAddress")
    @ApiOperation(value = "保存收货地址接口")
    public String insertAddress(ShopAddress shopAddress) {
        userService.insertAddress(shopAddress);
        return "1";
    }

    @RequestMapping("/showAllAddress")
    @ApiOperation(value = "展示所有用户地址接口")
    public List<ShopAddress> showAllAddress(String phoneNum) {
        System.out.println(phoneNum);
        List<ShopAddress> shopAddresses = userService.showAllAddress(phoneNum);
        return shopAddresses;
    }
    @RequestMapping("/findByToken")
    @ApiOperation(value = "token是否存在接口")
    public String findByToken (String token) {
        boolean result = userService.findByToken(token);
        System.out.println(token);
        if (result) {
            return "1";
        } else {
            return "0";
        }
    }
}
