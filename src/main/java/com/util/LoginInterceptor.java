package com.util;

import com.bean.UserBean;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Elivs on 2017/4/25.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

//    方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        boolean flag = false;

        HttpSession session = request.getSession();

        UserBean user = (UserBean) session.getAttribute("user");

        if (user != null) {
            flag = true;
        }else{
            System.out.println("拦截了");
            response.sendRedirect("login.jsp");
        }
        return flag;
    }
}
