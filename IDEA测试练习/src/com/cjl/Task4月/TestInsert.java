package com.cjl.Task4月;

import com.cjl.tools.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) {
        try (Connection conn = JDBCUtils.getConn();
             Statement stmt = conn.createStatement()) {
            String sql = "insert into student(sid, sname, sage, ssex, spassword, sphone) " +
                    "values (null,'chen',11,'m','password','12345678909');";
            int i = stmt.executeUpdate(sql);
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
