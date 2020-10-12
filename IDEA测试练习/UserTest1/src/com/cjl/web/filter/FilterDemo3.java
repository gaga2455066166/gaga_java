package com.cjl.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo3 implements Filter {


    /**
     * 服务器关闭，filter对象被销毁
     * 正常关闭，则执行，非正常则不执行
     */
    public void destroy() {
    }

    /**
     * 执行多次
     */
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }


    /**
     * 在服务器启动后就会创建filter对象，然后调用init方法
     */
    public void init(FilterConfig config) throws ServletException {
        System.out.println("销毁方法");

    }

}
