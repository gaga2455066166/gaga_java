package com.cjl.Service;

import com.cjl.Bean.Admin;
import com.cjl.Dao.Impl.AdminDaoImplement;

public class LogInService {
	AdminDaoImplement adminDaoImplement = new AdminDaoImplement();

	public Admin checkAdmin(Admin admin) {
		
		// TODO 自动生成的方法存根
		Admin logInAdmin = adminDaoImplement.selectAdminByAdmin(admin);
		
		return logInAdmin;
	}


}
