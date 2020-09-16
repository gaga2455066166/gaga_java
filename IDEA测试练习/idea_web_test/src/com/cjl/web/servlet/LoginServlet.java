package com.cjl.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
//        Map<String, String[]> parameterMap = request.getParameterMap();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");

        //先判断验证码是否正确
        HttpSession session = request.getSession();
        String checkCode_session = (String) session.getAttribute("checkCode_session");
        session.removeAttribute("checkCode_session");
        if (checkCode_session!=null && checkCode_session.equalsIgnoreCase(checkCode)) {
            //忽略大小写进行比较,验证码正确
            //判断用户名和密码
            //先假设一个用户
            System.out.println("验证码正确");
            if ("123".equals(username) && "123456".equals(password)) {
                //登录成功
                System.out.println("登录成功");
                session.setAttribute("username", username);
                response.sendRedirect(request.getContextPath() + "/success.jsp");

            } else {
                //登录失败
                request.setAttribute("user_error", "用户名或者密码错误");
                //转发到登录页
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        } else {
            //验证码不一样，则进行，存储提示信息到res
            request.setAttribute("checkCode_error", "验证码错误");
            //转发到登录页
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
