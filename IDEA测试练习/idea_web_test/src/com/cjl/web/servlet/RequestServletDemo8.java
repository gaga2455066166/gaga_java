package com.cjl.web.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestServletDemo8")
public class RequestServletDemo8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("8888888888888888888");
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/RequestServletDemo");
//        requestDispatcher.forward(request,response);
        request.setAttribute("msg","hello,你好");
        request.getRequestDispatcher("/RequestServletDemo9").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
