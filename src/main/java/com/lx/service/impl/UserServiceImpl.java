package com.lx.service.impl;

import com.lx.mapper.UserMapper;
import com.lx.pojo.User;
import com.lx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void updatePassword(String password) {
        userMapper.updatePassword(password);
    }
}
