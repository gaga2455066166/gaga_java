package com.cjl.web.servlet;

import com.cjl.domain.Cart;
import com.cjl.domain.Order;
import com.cjl.service.CartService;
import com.cjl.service.OrderService;
import com.cjl.service.impl.CartServiceImpl;
import com.cjl.service.impl.OrderServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/DetailOrderServlet")
public class DetailOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("DetailOrderServlet");
        String suser = request.getParameter("suser");
        System.out.println(suser);
        OrderService service = new OrderServiceImpl();
        List<Order> orders = service.findOrderListBySuser(suser);
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(orders);
            response.getWriter().print(json);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
