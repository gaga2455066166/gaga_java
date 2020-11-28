package com.cjl.web.servlet;

import com.cjl.domain.Commodity;
import com.cjl.domain.Img;
import com.cjl.service.CommodityService;
import com.cjl.service.ImgService;
import com.cjl.service.impl.CommodityServiceImpl;
import com.cjl.service.impl.ImgServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CommodityDetailServlet")
public class CommodityDetailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        String json = "";

        String btn = request.getParameter("btn");
        String nid = "";

        if ("loadMsg".equals(btn)) {
            nid = request.getParameter("nid");
//            System.out.println(nid);
            CommodityService service = new CommodityServiceImpl();
            Commodity commodityByNid = service.findCommodityByNid(Integer.parseInt(nid));
            json = mapper.writeValueAsString(commodityByNid);

        } else if ("loadImg".equals(btn)) {
            nid = request.getParameter("nid");
            ImgService imgService = new ImgServiceImpl();
            List<Img> imgs = imgService.findImgByNid(Integer.parseInt(nid));
//            System.out.println(imgs);
            json = mapper.writeValueAsString(imgs);


        }

        try {
            response.getWriter().print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
