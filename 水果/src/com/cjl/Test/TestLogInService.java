package com.cjl.Test;

import com.cjl.Bean.Admin;
import com.cjl.Dao.Impl.AdminDaoImplement;

public class TestLogInService {
    	public static void main(String[] args) {
		AdminDaoImplement adminDaoImplement = new AdminDaoImplement();
		Admin admin = new Admin();
		admin.setId(1);
		Admin logInAdmin = adminDaoImplement.selectAdminById(admin);
		System.out.println(logInAdmin.getName());
	}
}
