package com.cjl.web.servlet;

import com.cjl.domain.Cart;
import com.cjl.domain.Order;
import com.cjl.domain.ResultInfo;
import com.cjl.domain.User;
import com.cjl.service.CartService;
import com.cjl.service.OrderService;
import com.cjl.service.UserService;
import com.cjl.service.impl.CartServiceImpl;
import com.cjl.service.impl.OrderServiceImpl;
import com.cjl.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CreateOrderServlet")
public class CreateOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String suser = request.getParameter("suser");
        String sorder = request.getParameter("sorder");
        String ddate = request.getParameter("ddate");
        System.out.println(suser);
        System.out.println(sorder);
        System.out.println(ddate);

        CartService cartService = new CartServiceImpl();
        List<Cart> cartsBySuser = cartService.findCartListBySuser(suser);
        UserService userService = new UserServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        User userBySuser = userService.findUserBySuser(suser);
        ResultInfo info = new ResultInfo();
        for (Cart cart : cartsBySuser) {
            Order order = new Order();
            order.setSorder(sorder);
            order.setSuser(userBySuser.getSuser());
            order.setNid(cart.getNid());
            order.setSname(cart.getSname());
            order.setSdescription(cart.getSdescription());
            order.setNprice(cart.getNprice());
            order.setSimg(cart.getSimg());
            order.setNquantity(cart.getNquantity());
            order.setNtotal(cart.getNtotal());
            order.setDdate(ddate);
            order.setSaddress(userBySuser.getSaddress());
            order.setSdelivery("未发货");
            int save = orderService.saveOrderByOrder(order);
            System.out.println(order);
            if(save <1){
                System.out.println("Create Order Error！");
                info.setFlag(false);
                info.setErrorMsg("Create Order Error！");
            }
        }
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(info);
            response.getWriter().print(json);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
