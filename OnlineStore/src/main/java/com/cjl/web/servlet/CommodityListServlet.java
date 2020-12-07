package com.cjl.web.servlet;

import com.cjl.domain.Commodity;
import com.cjl.service.CommodityService;
import com.cjl.service.impl.CommodityServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@WebServlet("/CommodityListServlet")
public class CommodityListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        List<Commodity> commodityList = null;
        CommodityService service = new CommodityServiceImpl();
        if ("smaxid".equals(type)) {
            String value = request.getParameter("value");
            commodityList = service.findCommodityBySmaxid(value);
        } else if ("sname".equals(type)) {
            String value = request.getParameter("value");
            try {
                value = java.net.URLDecoder.decode(value, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            System.out.println(value);
            commodityList = service.findCommodityBySname(value);
        }
//        System.out.println(nmaxid);


        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(commodityList);

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
