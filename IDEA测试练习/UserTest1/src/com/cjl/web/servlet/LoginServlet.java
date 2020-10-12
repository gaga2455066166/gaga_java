package com.cjl.web.servlet;

import com.cjl.domain.User;
import com.cjl.service.UserService;
import com.cjl.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println(request);
        request.setCharacterEncoding("utf-8");

        //得到用户从页面中输入的验证码
        String verifycode = request.getParameter("verifycode");

        //通过session可以在应用程序的web页面间进行跳转时，保存用户的状态，
        // 使得整个用户会话一直存在下去，直到浏览器关闭。
        //使用session来得到跟CheckCodeServlet给与页面的图片对应的验证码
        //进行比较，并删除
        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");
        if (verifycode.equalsIgnoreCase(checkcode_server)) {
            System.out.println("后台信息：验证码正确");

            //得到用户在页面输入的信息组成的map集合
            Map<String, String[]> map = request.getParameterMap();
            User user = new User();
            try {

                //将map集合中的数据封装到loginuser中
                BeanUtils.populate(user, map);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }

            //得到用户的service，并使用service中的登录方法
            UserService service = new UserServiceImpl();
            User loginUser = service.login(user);

            if (loginUser != null){
                System.out.println("后台信息：用户登录成功");

                //将成功登录的用户信息存到session中，方便其他的页面使用
                session.setAttribute("user",loginUser);
                //重定向到index.jsp
                response.sendRedirect(request.getContextPath()+"/index.jsp");
            }else {
                System.out.println("后台信息：用户登录失败");
                request.setAttribute("login_msg", "用户名或者密码错误");

                //请求转发到原来的login.jsp，进行重新输入
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }

        } else {
            //验证码错误
            request.setAttribute("login_msg", "验证码错误");
            System.out.println("后台信息：验证码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
