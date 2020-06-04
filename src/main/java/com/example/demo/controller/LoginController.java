package com.example.demo.controller;

import com.example.demo.reslut.Result;
import com.example.demo.entity.User;
import com.example.demo.reslut.ResultFactory;
import com.example.demo.service.UserService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User resultUser, HttpSession session) {
        //对html标签进行转义，防止XSS攻击
        String username = resultUser.getUsername();
        Subject subject = SecurityUtils.getSubject();
        username = HtmlUtils.htmlEscape(username);
        UsernamePasswordToken usernamePasswordToken
                = new UsernamePasswordToken(username, resultUser.getPassword());
        try {
            subject.login(usernamePasswordToken);
            return ResultFactory.buildSuccessResult(username);
        } catch (Exception e) {
            System.out.println("账号或密码错误");
            String message = "账号或密码错误";
            return ResultFactory.buildFailResult(message);
        }

        /*User user = userService.getByUsernameAndPassword(username, resultUser.getPassword());

        if (user == null) {
            System.out.println("账号密码错误");
            return new Result(400);
        } else {
            session.setAttribute("user", user);
            return new Result(200);
        }*/
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping(value = "api/register")
    public Result register(@RequestBody User user) {
        System.out.println("1111111111111");
        int status = userService.register(user);
        switch (status) {
            case 0:
                return ResultFactory.buildFailResult("用户名和密码不能为空");
            case 1:
                return ResultFactory.buildSuccessResult("注册成功");
            case 2:
                return ResultFactory.buildFailResult("用户已存在");
        }
        return ResultFactory.buildFailResult("未知错误");
    }

/*    // 用户注册
    @PostMapping("api/register1")
    @ResponseBody
    public Result register1(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        username = HtmlUtils.htmlEscape(username);
        user.setUsername(username);

        boolean exist = userService.isExist(username);
        if (exist) {
            String message = "用户名已被使用";
            return ResultFactory.buildFailResult(message);
        }

        *//**
         * 生成盐,默认长度 16 位
         * 先生成了随机的 byte 数组，又转换成了字符串类型的 base64 编码并返回。
         * base64 没什么意义，这里绕这么一下，只是因为比起字节数组，很多人更习惯于用字符串
         *//*
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        // 设置 hash 算法迭代次数
        int times = 2;
        // 得到 hash 后的密码
        String encodedPassword = new SimpleHash("md5", password, salt, times).toString();
        // 存储用户信息，包括 salt 与 hash 后的密码
        user.setSalt(salt);
        user.setPassword(encodedPassword);
        //userService.add(user);

        return ResultFactory.buildSuccessResult(user);
    }*/

    @CrossOrigin
    @ResponseBody
    @GetMapping("api/logout")
    public Result logout() {
        Subject subject = SecurityUtils.getSubject();
        /**
         * 核心方法为subject.logout()
         * 该方法内部会清除session、principals，并把 authenticated 设置为 false
         */
        subject.logout();
        String message = "成功登出";
        return ResultFactory.buildSuccessResult(message);
    }



    @ResponseBody
    @RequestMapping(value = "/findAll1")
    public User findAll() {
        return userService.findAll1();
    }
}
