package com.cjl.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * c3p0演示
 */
public class C3p0Demo1 {
    public static void main(String[] args) {
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        Connection conn;

        {
            try {
                for (int i = 0; i < 13; i++) {
                    conn = ds.getConnection();
                    System.out.println(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
