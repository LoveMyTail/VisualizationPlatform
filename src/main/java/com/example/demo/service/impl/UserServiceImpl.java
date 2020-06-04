package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.HtmlUtils;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Transactional
    @Override
    public User findUserByName(String username) {
        return userDao.findUserByName(username);
    }

    @Transactional
    @Override
    public User getByUsernameAndPassword(String username, String password) {
        return userDao.getByUsernameAndPassword(username,password);
    }

    @Override
    public User findAll1() {
        return userDao.findAll1();
    }

    @Override
    public boolean isExist(String username) {
        User user = userDao.findUserByName(username);
        return null!=user;
    }

//    @Override
//    public void add(User user) {
//
//    }

//    @Override
//    public User getByUserName(String userName) {
//        return null;
//    }

    @Override
    public int register(User user) {
        String username = user.getUsername();
//        String name = user.getName();
//        String phone = user.getPhone();
//        String email = user.getEmail();
        String password = user.getPassword();

        username = HtmlUtils.htmlEscape(username);
        user.setUsername(username);
//        name = HtmlUtils.htmlEscape(name);
//        user.setName(name);
//        phone = HtmlUtils.htmlEscape(phone);
//        user.setPhone(phone);
//        email = HtmlUtils.htmlEscape(email);
//        user.setEmail(email);
//        user.setEnabled(true);

        if (username.equals("") || password.equals("")) {
            return 0;
        }

        boolean exist = isExist(username);

        if (exist) {
            return 2;
        }

        // 默认生成 16 位盐
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        int times = 2;
        String encodedPassword = new SimpleHash("md5", password, salt, times).toString();

        user.setSalt(salt);
        user.setPassword(encodedPassword);

        userDao.save(user);

        return 1;
    }
}
