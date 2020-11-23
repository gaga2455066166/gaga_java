package com.cjl.web.servlet;

import com.cjl.domain.Commodity;
import com.cjl.domain.ResultInfo;
import com.cjl.service.CommodityService;
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

@WebServlet("/AdminAddCommodity")
public class AdminAddCommodity extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
        map.forEach((key, value) -> System.out.println(key + ":" + Arrays.toString(value)));
        Commodity commodity = new Commodity();
        ResultInfo info = new ResultInfo();
        try {
            BeanUtils.populate(commodity, map);

        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(commodity);
        CommodityService service = new CommodityServiceImpl();
        int i = service.AddCommodity(commodity);
        if (i > 0) {
            info.setFlag(true);
            info.setErrorMsg("成功添加商品！");
        }else {
            info.setFlag(false);
            info.setErrorMsg("添加商品失败，请检查商品nid后再尝试！");
        }

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(info);

        //将json写回客户端
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
