package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

    User findUserByName(String username);

    // 根据用户名和密码查询用户
    User getByUsernameAndPassword(String username, String password);

    User findAll1();

    // 判断用户是否存在
    boolean isExist(String username);

    // 注册用户
    // void add(User user);


    // 用户注册
    int register(User user);

}
