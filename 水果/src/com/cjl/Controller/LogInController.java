package com.cjl.Controller;

import com.cjl.Bean.Admin;
import com.cjl.Service.LogInService;
import com.cjl.view.LogInJFrame;

public class LogInController extends LogInJFrame{
	LogInService logInService = new LogInService();

	@Override
	protected void logIn() {
		// TODO �Զ����ɵķ������
		Admin admin = new Admin();
		boolean check = logInService.checkAdmin(admin);
		
	}

	@Override
	protected void empty() {
		// TODO �Զ����ɵķ������
		textField.setText("");
		passwordField.setText("");
	}

}
