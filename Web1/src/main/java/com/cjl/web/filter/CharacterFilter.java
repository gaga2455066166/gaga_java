package com.cjl.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 解决全站乱码问题，处理所有的请求
 */
@WebFilter("/*")
public class CharacterFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse rep, FilterChain filterChain) throws IOException, ServletException {

//        req.setCharacterEncoding("utf-8");
//        rep.setContentType("text/html;charset=utf-8");
//        rep.setCharacterEncoding("utf-8");
//        filterChain.doFilter(req, rep);

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) rep;
        String requestURI = request.getRequestURI();//查看请求
        System.out.println(requestURI);
//        String contentType = request.getHeader("Accept");//类型
//        System.out.println(contentType);
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        if (requestURI.contains("/css/") ||
                requestURI.contains("/js/") ||
                requestURI.contains("/fonts/") ||
                requestURI.contains("/img/") ||
                requestURI.contains("/images/") ||
                requestURI.contains("/error/")) {
//            System.out.println("css");
            response.setContentType("text/css;charset=utf-8");
            filterChain.doFilter(request, response);
            return;
        }

        response.setContentType("text/html;charset=utf-8");
//        response.setContentType(contentType == null ? "text/html;charset=utf-8" : contentType + ";charset=utf-8");
        filterChain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }
}
