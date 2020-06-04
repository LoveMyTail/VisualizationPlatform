package com.example.demo.realm;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class Realm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    // 简单重写获取授权信息方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo s = new SimpleAuthorizationInfo();
        return s;
    }

    // 获取认证信息，根据token中的用户名从数据库中获取密码、盐等并返回
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = authenticationToken.getPrincipal().toString();
        User user = userService.findUserByName(userName);
        String passwordInDB = user.getPassword();
        String salt = user.getSalt();
        /**
         * 这里我们再次关注 salt，不知道为什么，SimpleAuthenticationInfo 中的 salt 非得存储成 byte[]，于是我们又费劲绕了一遍把 String 搞了回去。
         * 不过这里的 byte[] 并不是我们当初随机生成的那个，而是随机生成的 byte[] 按 base64 编码成 String 又按 UTF-8 编码成的 byte[]。
         */
        // System.out.println(salt);
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userName, passwordInDB, ByteSource.Util.bytes(salt), getName());
        return authenticationInfo;

    }
}
