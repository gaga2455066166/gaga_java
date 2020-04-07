package com.cjl.Task4月;

import com.cjl.tools.JDBCUtils;

import java.sql.*;

public class TestJdbc {
    public static void main(String[] args) {
//        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String user = "root";
//            String password = "94232566";
//            String url = "jdbc:mysql://localhost:3306/db_55?serverTimezone=UTC&characterEncoding=utf-8"; // 数据库连接地址
//             con = DriverManager.getConnection(url, user, password);
            stmt = JDBCUtils.getConn().createStatement();
            String sql = "select * From student";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                System.out.println(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert rs != null;
                rs.close();
                stmt.close();
//                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
