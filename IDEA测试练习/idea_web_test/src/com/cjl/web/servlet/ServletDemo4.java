package com.cjl.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet({"/demo4","/demo44","/demo444"})
//@WebServlet("/demo4/*")
@WebServlet("*.do")
public class ServletDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get");
        String method = request.getMethod();//获取请求方式
        System.out.println(method);
        String contextPath = request.getContextPath();//获取虚拟路径
        System.out.println(contextPath);
        String servletPath = request.getServletPath();//获取servlet路径
        System.out.println(servletPath);
        String queryString = request.getQueryString();
        System.out.println(queryString);//获取参数
        String requestURI = request.getRequestURI();//获取URI
        System.out.println(requestURI);
        StringBuffer requestURL = request.getRequestURL();//获取URL
        System.out.println(requestURL);
        String protocol = request.getProtocol();//获取协议和版本
        System.out.println(protocol);
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);


    }
}
