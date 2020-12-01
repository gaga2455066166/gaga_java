package com.cjl.web.servlet;

import com.cjl.domain.Commodity;
import com.cjl.domain.ResultInfo;
import com.cjl.domain.User;
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
import java.util.List;
import java.util.Map;

@WebServlet("/AdminModifyCommodityServlet")
public class AdminModifyCommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
        Commodity commodity = new Commodity();
        try {
            BeanUtils.populate(commodity, map);

        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        CommodityService service = new CommodityServiceImpl();
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        ResultInfo info = new ResultInfo();
        if (service.modifyCommodity(commodity)>0){
            info.setErrorMsg("商品信息修改成功");
        }else {
            info.setErrorMsg("商品信息修改失败");
        }
        json = mapper.writeValueAsString(info);


        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
