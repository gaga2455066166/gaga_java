package com.cjl.Service;

import com.cjl.Bean.Admin;
import com.cjl.Dao.Impl.AdminDaoImplement;

public class LogInService {
	AdminDaoImplement adminDaoImplement = new AdminDaoImplement();

	public Admin checkAdmin(Admin admin) {
		
		// TODO �Զ����ɵķ������
		Admin logInAdmin = adminDaoImplement.selectAdminByAdmin(admin);
		
		return logInAdmin;
	}


}
