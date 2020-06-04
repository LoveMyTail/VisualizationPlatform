package com.example.demo.interceptor;


import com.example.demo.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 配置登陆的拦截器
 * 在 Springboot 我们可以直接继承拦截器的接口，然后实现 preHandle 方法
 * 判断 session 中是否存在 user 属性，如果存在就放行，如果不存在就跳转到 login 页面。
 * 这里使用了一个路径列表（requireAuthPages），可以在里面写下需要拦截的路径。
 * 当然也可以拦截所有路径，那样就不用写这么多了，但会有逻辑上的问题，就是你访问了 \login 页面，
 * 仍然会需要跳转，这样就会引发多次重定向问题
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        HttpSession session = request.getSession();
        String contextPath = session.getServletContext().getContextPath();
        String[] requireAuthPages = new String[]{"index"};

        String uri = request.getRequestURI();
        uri = StringUtils.remove(uri, contextPath+"/");
        String page = uri;

        if(beginWith(page, requireAuthPages)){
            User user = (User) session.getAttribute("user");
            if(user==null) {
                response.sendRedirect("login");
                return false;
            }
        }
        return true;
    }

    private boolean beginWith(String page, String[] requiredAuthPages) {
        boolean result = false;
        for (String requiredAuthPage : requiredAuthPages) {
            if(StringUtils.startsWith(page, requiredAuthPage)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
