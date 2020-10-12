package com.cjl.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        System.out.println(req);
        //首先应该强制转换
        HttpServletRequest request = (HttpServletRequest) req;

        //获取资源请求路径
        String requestURI = request.getRequestURI();
        if (requestURI.contains("/login.jsp") || requestURI.contains("/LoginServlet")
                || requestURI.contains("/css/") || requestURI.contains("/js/")
                || requestURI.contains("/fonts/") || requestURI.contains("/CheckCodeServlet")){
            //包含的话就是，用户想登录，所以就放行
            chain.doFilter(req, resp);
        }else{
            //验证用户是否登录
            //从session中获取user
            Object user = request.getSession().getAttribute("user");
            if (user != null){
                //就是已经登录了
                //所以直接放行
                chain.doFilter(req, resp);
            }else {
                //为空的话，就是没有登录，跳转登录页面
                request.setAttribute("login_msg","您尚未登录");
                request.getRequestDispatcher("/login.jsp").forward(request,resp);
            }
        }

//        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
