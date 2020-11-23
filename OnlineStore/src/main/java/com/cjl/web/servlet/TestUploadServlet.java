package com.cjl.web.servlet;

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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/TestUploadServlet")
public class TestUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin","*");
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        String id = null;
        FileItem file = null;
        String fileType = null;
        try {
            List<FileItem> list = upload.parseRequest(request);
            for (FileItem fileItem : list){
                if (fileItem.isFormField()){
                    String name = fileItem.getFieldName();
                    id = fileItem.getString("utf-8");
                    System.out.println(name);
                    System.out.println(id);
                }else{
                    file = fileItem;
                    String name = fileItem.getName();
                    fileType = name.substring(name.lastIndexOf("."));
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }

        File f = new File("E:\\上传的文件\\"+id+fileType);
        try {
            file.write(f);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
