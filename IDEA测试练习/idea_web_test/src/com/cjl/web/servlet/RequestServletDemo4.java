package com.cjl.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestServletDemo4")
public class RequestServletDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer = request.getHeader("referer");
        System.out.println(referer);
        if(referer!=null){
            if(referer.contains("/idea_web_test_war_exploded")){
//                System.out.println("正常访问");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("正常访问");
            }
            else {
                System.out.println("盗链");
            }
        }
    }
}
