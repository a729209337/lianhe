package com.lx.service;

import com.lx.pojo.ShopAddress;
import com.lx.pojo.User;

import java.util.List;

public interface UserService {

    boolean login(User user);

    boolean validatePhoneNum(String phoneNumber);

    boolean validateName(String name);

    void register(User user);

//    boolean validatePassword(String password);

    void updatePassword(User user);

    void insertAddress(ShopAddress shopAddress);

    List<ShopAddress> showAllAddress(String phoneNum);
}
