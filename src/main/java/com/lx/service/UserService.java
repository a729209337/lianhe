package com.lx.service;

import com.lx.pojo.User;

public interface UserService {

    boolean login(User user);

    boolean validatePhoneNum(String phoneNumber);

    void register(User user);
}
