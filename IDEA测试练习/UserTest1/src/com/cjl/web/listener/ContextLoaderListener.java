package com.cjl.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("在服务器被正常关闭后，这个方法被调用，ServletContext对象被销毁......");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("服务器启动后，ServletContext对象被创建......");
    }
}
