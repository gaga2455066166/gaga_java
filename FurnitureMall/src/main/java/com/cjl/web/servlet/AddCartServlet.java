package com.cjl.web.servlet;

import com.cjl.domain.Cart;
import com.cjl.domain.ResultInfo;
import com.cjl.service.CartService;
import com.cjl.service.CommodityService;
import com.cjl.service.impl.CartServiceImpl;
import com.cjl.service.impl.CommodityServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/AddCartServlet")
public class AddCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
//        map.forEach((key, value) -> System.out.println(key + ":" + Arrays.toString(value)));
        Cart cart = new Cart();
        try {
            BeanUtils.populate(cart, map);

        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        CartService service = new CartServiceImpl();
        int i = service.addCommodityToCart(cart);
        ResultInfo info = new ResultInfo();
        if (i>0){
            info.setFlag(true);
            info.setErrorMsg("已加入购物车");
        }else {
            info.setFlag(false);
            info.setErrorMsg("加入购物车失败");
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
