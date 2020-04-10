package com.cjl.Task4月;

import com.cjl.tools.JDBCUtils;

import java.sql.*;

public class TestPreparedStatement {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConn();
            String sql = "select * from student where sid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,9);
            rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.print(rs.getInt("sid") + "\t");
                System.out.print(rs.getString("sname") + "\t");
                System.out.print(rs.getInt("sage") + "\t");
                System.out.println(rs.getString("ssex"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,pstmt,rs);
        }
    }
}
