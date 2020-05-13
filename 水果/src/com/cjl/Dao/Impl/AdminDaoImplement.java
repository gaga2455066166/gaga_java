package com.cjl.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cjl.Bean.Admin;
import com.cjl.Dao.AdminDao;
import com.cjl.Tool.JDBCUtils;

public class AdminDaoImplement implements AdminDao{
	private static ResultSet rs =null;
    private static Connection conn = null;
    PreparedStatement preparedStatement =null;
    
    
    public AdminDaoImplement(){
    	conn = JDBCUtils.getConn();
		
	}
	@Override
	public Admin selectAdminById(Admin admin) {
		String sql = "SELECT * FROM admin where id = ?";
		Admin logInAdmin = new Admin();
		try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, admin.getId());
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                
                logInAdmin.setId(rs.getInt("id"));
                logInAdmin.setPassword(rs.getString("password"));
                logInAdmin.setName(rs.getString("name"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		return logInAdmin;
	}
	@Override
	public Admin selectAdminByAdmin(Admin admin) {
		String sql = "SELECT * FROM admin where id = ? and password = ?";
		Admin logInAdmin = new Admin();
		boolean flag = false;
		try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, admin.getId());
            preparedStatement.setString(2, admin.getPassword());
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
            	flag = true;
                logInAdmin.setId(rs.getInt("id"));
                logInAdmin.setPassword(rs.getString("password"));
                logInAdmin.setName(rs.getString("name"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
		if(flag == true) {
			return logInAdmin;
		}
		else {
			return null;
		}
	}
    
    
	
    
	
	
}
