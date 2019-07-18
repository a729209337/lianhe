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
}
