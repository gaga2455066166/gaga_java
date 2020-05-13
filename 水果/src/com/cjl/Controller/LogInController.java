package com.cjl.Controller;

import javax.swing.JOptionPane;

import com.cjl.Bean.Admin;
import com.cjl.Service.LogInService;
import com.cjl.Tool.StringUtils;
import com.cjl.view.LogInJFrame;
import com.cjl.view.MainJFrame;

public class LogInController extends LogInJFrame{
	LogInService logInService = new LogInService();

	@Override
	protected void logIn() {
		// TODO 自动生成的方法存根
		if(isEmpty()!=true) {
			Admin admin = new Admin();
			
			String textFieldString = textField.getText();
			String password = String.valueOf(passwordField.getPassword());
			
			Integer id = Integer.valueOf(textFieldString);
			
			admin.setId(id);
			admin.setPassword(password);
			
			Admin logInAdmin = logInService.checkAdmin(admin);
			if (logInAdmin != null) {
				// JOptionPane.showMessageDialog(null, "登录成功！");
				dispose();
				JOptionPane.showMessageDialog(null, "欢迎你，管理员 "+logInAdmin.getName()+"。");
				new MainController().setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "用户名或者密码错误！");
				setEmpty();
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "请确认后登录");
		}
		
	}

	@Override
	protected void setEmpty() {
		// TODO 自动生成的方法存根
		textField.setText("");
		passwordField.setText("");
	}

	@Override
	protected boolean isEmpty() {
		// TODO 自动生成的方法存根
		String textFieldString = textField.getText();
		String password = String.valueOf(passwordField.getPassword());
		
		if(StringUtils.isEmpty(textFieldString) == true || StringUtils.isEmpty(password) == true ) {
			JOptionPane.showMessageDialog(null, "用户ID或者密码不能为空");
			return true;
		}
		
		
		
		return false;
	}

}
