package com.cjl.tools;

import java.sql.*;

public class JDBCUtils {
    private static Connection conn = null;
    private static final String url = "jdbc:mysql://localhost:3306/db_55?serverTimezone=UTC&characterEncoding=utf-8"; // 数据库连接地址
    private static final String user = "root";
    private static final String password = "94232566";
    private static final String DriverName = "com.mysql.cj.jdbc.Driver";
    public static Connection getConn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void  close(Connection conn, PreparedStatement pst){
        if(pst != null){
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void  close(Connection conn, PreparedStatement pst, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(pst != null){
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
