package com.cjl.Task4月;

import com.cjl.tools.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = JDBCUtils.getConn();
            stmt = conn.createStatement();
            String sql = "update student set sname = '龚佳煌' where sid = 9;";
            int i = stmt.executeUpdate(sql);
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,stmt);
        }

    }
}
