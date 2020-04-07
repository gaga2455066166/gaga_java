package com.cjl.Task4月;

import com.cjl.tools.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConn();
            stmt = conn.createStatement();
            String sql = "select * from student";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.print(rs.getInt("sid") + "\t");
                System.out.print(rs.getString("sname") + "\t");
                System.out.print(rs.getInt("sage") + "\t");
                System.out.println(rs.getString("ssex"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                assert rs != null;
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
