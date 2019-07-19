package com.lx.service;

import com.lx.pojo.User;

public interface UserService {

    boolean login(User user);

    boolean validatePhoneNum(String phoneNumber);

    boolean validateName(String name);

    void register(User user);

//    boolean validatePassword(String password);

    void updatePassword(String password);

}
