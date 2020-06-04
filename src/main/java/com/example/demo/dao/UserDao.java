package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User findUserByName(String username);
    User getByUsernameAndPassword(String username,String password);
    User findAll1();

    // 保存用户，在数据库中添加数据
    void save(User user);

    // 根据用户名查询用户
    //User findByUsername(String username);
}
