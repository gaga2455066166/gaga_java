package com.cjl.Service;

import com.cjl.Bean.Admin;
import com.cjl.Dao.Impl.AdminDaoImplement;

public class LogInService {
	AdminDaoImplement adminDaoImplement = new AdminDaoImplement();

	public boolean checkAdmin(Admin admin) {
		
		// TODO �Զ����ɵķ������
		Admin logInAdmin = adminDaoImplement.selectAdminById(admin);
		return false;
	}


}
