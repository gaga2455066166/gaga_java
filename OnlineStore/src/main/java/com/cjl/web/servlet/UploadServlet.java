package com.cjl.web.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DiskFileItemFactory factory = new DiskFileItemFactory();
//        factory.setRepository(new File("D:\\YOHO\\"));
        factory.setRepository(new File(request.getServletContext().getRealPath("/commodityImg/")));
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setSizeMax(1024 * 1024);
        upload.setFileSizeMax(1024 * 1024);
        upload.setHeaderEncoding("UTF-8");
        try {
            //解析请求，将表单中每个输入项封装成一个FileItem对象
            List<FileItem> itemList = upload.parseRequest(request);
            for (FileItem item : itemList) {
                //判断输入的类型是 普通输入项 还是文件
                if (item.isFormField()) {
                    //普通输入项 ,得到input中的name属性的值
                    String name = item.getFieldName();
                    //得到输入项中的值
                    String value = item.getString("UTF-8");
                    System.out.println("name=" + name + "  value=" + value);
                } else {
                    //上传的是文件，获得文件上传字段中的文件名
                    //注意IE或FireFox中获取的文件名是不一样的，IE中是绝对路径，FireFox中只是文件名。
                    String fileName = item.getName();
                    System.out.println(fileName);
                    //返回表单标签name属性的值
                    String namede = item.getFieldName();
                    System.out.println(namede);

                    item.write(new File(request.getServletContext().getRealPath("/commodityImg/") + fileName));
//                    item.write(new File("").getAbsoluteFile());
                    System.out.println(new File("").getAbsoluteFile());
                    System.out.println(request.getServletContext().getRealPath("/"));
//                    is.close();
//                    fos.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
