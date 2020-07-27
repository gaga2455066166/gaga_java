package com.cjl.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/RequestServletDemo6")
public class RequestServletDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
//        System.out.println("post");
//        System.out.println(username);
//        String[] hobbies = request.getParameterValues("hobby");
//        for (String hobby :
//                hobbies) {
//            System.out.println(hobby);
//        }


//        Enumeration<String> parameterNames = request.getParameterNames();
//        while (parameterNames.hasMoreElements()){
//            String s = parameterNames.nextElement();
//            System.out.println(s);
//            String value = request.getParameter(s);
//            System.out.println(value);
//            System.out.println("--------------------");
//        }

        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> keySet = parameterMap.keySet();
        for (String key : keySet) {
            System.out.println(key);
//            String value = request.getParameter(key);
//            System.out.println(value);
//            System.out.println("--------------------");
            String[] values = parameterMap.get(key);
            for (String value : values) {
                System.out.println(value);
                System.out.println("**************");
            }
            System.out.println("********************************");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        System.out.println("get");
//        System.out.println(username);
        this.doPost(request,response);
    }
}
