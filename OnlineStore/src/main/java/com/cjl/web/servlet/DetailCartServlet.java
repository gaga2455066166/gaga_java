package com.cjl.web.servlet;

import com.cjl.domain.Cart;
import com.cjl.domain.Commodity;
import com.cjl.service.CartService;
import com.cjl.service.CommodityService;
import com.cjl.service.impl.CartServiceImpl;
import com.cjl.service.impl.CommodityServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/DetailCartServlet")
public class DetailCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("DetailCartServlet");
        String suser = request.getParameter("suser");
//        System.out.println(suser);
        CartService service = new CartServiceImpl();
        List<Cart> carts = service.findCartListBySuser(suser);
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(carts);
            response.getWriter().print(json);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
