package com.cjl.Dao;

import com.cjl.Bean.Admin;

public interface AdminDao {
	
	
	public abstract Admin selectAdminById(Admin admin);	
	public abstract Admin selectAdminByAdmin(Admin admin);	

}
