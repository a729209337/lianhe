package com.lx.service;

import com.lx.pojo.User;

public interface AdminService {
    boolean login(User user);

    void register(User user);
}
