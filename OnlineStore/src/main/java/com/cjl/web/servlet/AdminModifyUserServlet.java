package com.cjl.web.servlet;

import com.cjl.domain.Commodity;
import com.cjl.domain.ResultInfo;
import com.cjl.domain.User;
import com.cjl.service.CommodityService;
import com.cjl.service.UserService;
import com.cjl.service.impl.CommodityServiceImpl;
import com.cjl.service.impl.UserServiceImpl;
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

@WebServlet("/AdminModifyUserServlet")
public class AdminModifyUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String btn = request.getParameter("btn");
        UserService service = new UserServiceImpl();
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        ResultInfo info = new ResultInfo();

        if ("showAll".equals(btn)) {
            List<User> allUser = service.findAllUser();
            System.out.println(Arrays.toString(allUser.toArray()));
            json = mapper.writeValueAsString(allUser);

        } else if ("showBySuser".equals(btn)) {
            String suser = request.getParameter("suser");
            User user = service.findUserBySuser(suser);
////            System.out.println(commodity);
            json = mapper.writeValueAsString(user);
        } else if ("modify".equals(btn)) {
            Map<String, String[]> map = request.getParameterMap();
//            map.forEach((key, value) -> System.out.println(key + ":" + Arrays.toString(value)));
            User user = new User();
            try {
                BeanUtils.populate(user, map);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
//            int modify = service.modifyUserBySuser(user);
            if (service.modifyUserBySuser(user) > 0) {
                info.setErrorMsg("用户信息修改成功");
            } else {
                info.setErrorMsg("修改失败，请检查后重试！");
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
