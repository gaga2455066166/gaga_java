package com.cjl.web.servlet;

import com.cjl.domain.Commodity;
import com.cjl.domain.ResultInfo;
import com.cjl.service.CommodityService;
import com.cjl.service.impl.CommodityServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/TestUploadServlet")
public class TestUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        Commodity commodity = new Commodity();
        ResultInfo info = new ResultInfo();
        Map<String, String> map = new HashMap<>();
        FileItem file = null;
        String fileType = null;
        try {
            List<FileItem> list = upload.parseRequest(request);
            for (FileItem fileItem : list) {
                if (fileItem.isFormField()) {
                    map.put(fileItem.getFieldName(), fileItem.getString("utf-8"));
                } else {
                    file = fileItem;
                    String name = fileItem.getName();
                    fileType = fileItem.getName().substring(name.lastIndexOf("."));
                    map.put(fileItem.getFieldName(), "commodityImg/" + map.get("nid") + fileType);
                }
            }
            BeanUtils.populate(commodity, map);
        } catch (FileUploadException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
//        System.out.println(commodity);

//        File f = new File(request.getServletContext().getRealPath("/commodityImg/") + map.get("nid") + fileType);
        File f = new File("D:\\local_github\\java\\gaga_java\\OnlineStore\\src\\main\\webapp\\commodityImg\\" + map.get("nid") + fileType);
        try {
            assert file != null;
            file.write(f);
        } catch (Exception e) {
            e.printStackTrace();
        }

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
