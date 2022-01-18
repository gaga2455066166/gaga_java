package com.cjl.servlet;

import com.cjl.domain.Student;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/TestServlet6")
public class TestServlet6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //项目启动时，服务器就会建立这个对象，服务器关闭才销毁这个对象，这意味着在整web项目存活期间都可以使用，只要你能获取到对象。
        Student student = new Student();
        student.setName("erD");
        student.setId(5);
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("student",student);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
