package com.lx.service.impl;

import com.lx.mapper.UserMapper;
import com.lx.pojo.ShopAddress;
import com.lx.pojo.User;
import com.lx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean login(User user) {
        int result = userMapper.login(user);
        return result > 0 ? true : false;
    }

    @Override
    public boolean validatePhoneNum(String phoneNumber) {
        int result = userMapper.validatePhoneNum(phoneNumber);
        return result > 0 ? false : true;
    }

    @Override
    public boolean validateName(String name) {
        int result = userMapper.validateName(name);
        return result > 0 ? false : true;
    }

    @Override
    public void register(User user) {
        userMapper.register(user);
    }

    /*@Override
    public boolean validatePassword(String password) {
        int result = userMapper.validatePassword(password);
        return result > 0 ? true : false;
    }*/

    @Override
    public void updatePassword(User user) {
        userMapper.updatePassword(user);
    }

    @Override
    public List<User> showAppraise() {
        List<User> userList = userMapper.showAppraise();
        return userList;
    }

    @Override
    public void insertAddress(ShopAddress shopAddress) {
        userMapper.insertAddress(shopAddress);
    }

    @Override
    public List<ShopAddress> showAllAddress(String phoneNum) {
        System.out.println(phoneNum);
        List<ShopAddress> shopAddresses = userMapper.showAllAddress(phoneNum);
        System.out.println(shopAddresses);
        return shopAddresses;
    }

    @Override
    public void updateToken(User user) {
        userMapper.updateToken(user);
    }

    @Override
    public boolean findByToken(String token) {
        int result = userMapper.findByToken(token);
        return result > 0 ? true : false;
    }
}
