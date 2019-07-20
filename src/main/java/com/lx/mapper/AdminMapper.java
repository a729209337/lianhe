package com.lx.mapper;

import com.lx.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminMapper {
    int login(User user);

    void register(User user);
}
