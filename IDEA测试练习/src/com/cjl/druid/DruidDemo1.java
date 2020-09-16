package com.cjl.druid;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo1 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        InputStream is = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            pro.load(is);
            DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
            Connection conn = dataSource.getConnection();
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
