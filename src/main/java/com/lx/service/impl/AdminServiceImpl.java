package com.lx.service.impl;

import com.lx.mapper.AdminMapper;
import com.lx.pojo.User;
import com.lx.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public boolean login(User user) {
        int result = adminMapper.login(user);
        return result > 0 ? true : false;
    }

    @Override
    public void register(User user) {
        adminMapper.register(user);
    }
}
