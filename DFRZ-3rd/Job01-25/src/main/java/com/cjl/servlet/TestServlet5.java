package com.cjl.servlet;

import com.cjl.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/TestServlet5")
public class TestServlet5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //当会话还没有结束时，可以取出来，当会话结束时，即浏览器关闭重开，session被清空，取不到，除非设置session的生命周期
        HttpSession session = request.getSession();
        Student student = (Student) session.getAttribute("student");
        System.out.println(student);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
