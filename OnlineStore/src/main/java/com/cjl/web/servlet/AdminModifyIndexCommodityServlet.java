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
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@WebServlet("/AdminModifyIndexCommodityServlet")
public class AdminModifyIndexCommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String btn = request.getParameter("btn");
        CommodityService service = new CommodityServiceImpl();
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        if ("showAll".equals(btn)){
//            做展示全部的操作
            List<Commodity> allCommodity = service.findAllCommodity();
            System.out.println(Arrays.toString(allCommodity.toArray()));
            json = mapper.writeValueAsString(allCommodity);

        }else{
            String nid = request.getParameter("nid");
            Commodity commodity = service.findCommodityByNid(Integer.parseInt(nid));
            System.out.println(commodity);
            json = mapper.writeValueAsString(commodity);
        }
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
