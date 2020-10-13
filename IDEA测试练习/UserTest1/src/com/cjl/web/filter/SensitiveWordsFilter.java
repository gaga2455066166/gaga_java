package com.cjl.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 敏感词汇过滤器
 */
@WebFilter("/*")
public class SensitiveWordsFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //创建代理对象
        ServletRequest proxy_req = (ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强getParameter方法
                if (method.getName().equals("getParameter")) {
                    //增强
                    String value = (String) method.invoke(req, args);
                    if (value!=null){
                        for (String str : list) {
                            
                        }
                    }

                }
                return method.invoke(req, args);

            }
        });
        //放行
        chain.doFilter(proxy_req, resp);
    }


    private List<String> list = new ArrayList<>();//敏感词汇集合

    public void init(FilterConfig config) throws ServletException {
        //在init中加载配置文件
        try {
            ServletContext servletContext = config.getServletContext();
            String realPath = servletContext.getRealPath("/WEB-INF/classes/敏感词汇.txt");
            BufferedReader br = new BufferedReader(new FileReader(realPath));
            String line = null;
            while ((line = br.readLine())!=null){
                list.add(line);
            }
            br.close();
            System.out.println(list);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
