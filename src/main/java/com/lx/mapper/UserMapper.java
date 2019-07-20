package com.lx.mapper;

import com.lx.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int login(User user);

    int validatePhoneNum(String phoneNumber);

    int validateName(String name);

    void register(User user);

//    int validatePassword(String password);

    void updatePassword(String password);

}
