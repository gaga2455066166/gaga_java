package com.cjl.web.servlet;

import com.cjl.domain.Commodity;
import com.cjl.domain.ResultInfo;
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
        ResultInfo info = new ResultInfo();
        if ("showAll".equals(btn)) {
//            做展示全部的操作
            List<Commodity> allCommodity = service.findAllCommodity();
//            System.out.println(Arrays.toString(allCommodity.toArray()));
            json = mapper.writeValueAsString(allCommodity);

        } else if ("showByNid".equals(btn)) {
            String nid = request.getParameter("nid");
            Commodity commodity = service.findCommodityByNid(Integer.parseInt(nid));
//            System.out.println(commodity);
            json = mapper.writeValueAsString(commodity);
        } else if ("setIndex".equals(btn)) {
            //做一些操作
//            System.out.println("set");
            String nid = request.getParameter("nid");
            if (service.modifyCommoditySindex(Integer.parseInt(nid), "是") > 0) {
                info.setErrorMsg("成功设定该商品为首页！");
            }else {
                info.setErrorMsg("设定失败，请检查后重试！");
            }
            json = mapper.writeValueAsString(info);

        } else if ("cancelIndex".equals(btn)) {
            //取消首页
            String nid = request.getParameter("nid");
            if (service.modifyCommoditySindex(Integer.parseInt(nid), "否") > 0) {
                info.setErrorMsg("成功取消该商品的首页！");
            }else {
                info.setErrorMsg("取消失败，请检查后重试！");
            }
            json = mapper.writeValueAsString(info);
        }


        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
