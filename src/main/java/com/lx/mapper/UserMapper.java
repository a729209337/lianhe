package com.lx.mapper;

import com.lx.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int login(User user);

    int validatePhoneNum(String phoneNumber);

    void register(User user);
}
