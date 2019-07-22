package com.lx.mapper;

import com.lx.pojo.ShopAddress;
import com.lx.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int login(User user);

    int validatePhoneNum(String phoneNumber);

    int validateName(String name);

    void register(User user);

//    int validatePassword(String password);

    void updatePassword(User user);

    void insertAddress(ShopAddress shopAddress);

    List<ShopAddress> showAllAddress(String phoneNum);
}
