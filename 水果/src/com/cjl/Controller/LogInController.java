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
		// TODO �Զ����ɵķ������
		if(isEmpty()!=true) {
			Admin admin = new Admin();
			
			String textFieldString = textField.getText();
			String password = String.valueOf(passwordField.getPassword());
			
			Integer id = Integer.valueOf(textFieldString);
			
			admin.setId(id);
			admin.setPassword(password);
			
			Admin logInAdmin = logInService.checkAdmin(admin);
			if (logInAdmin != null) {
				// JOptionPane.showMessageDialog(null, "��¼�ɹ���");
				dispose();
				JOptionPane.showMessageDialog(null, "��ӭ�㣬����Ա "+logInAdmin.getName()+"��");
				new MainController().setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "�û��������������");
				setEmpty();
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "��ȷ�Ϻ��¼");
		}
		
	}

	@Override
	protected void setEmpty() {
		// TODO �Զ����ɵķ������
		textField.setText("");
		passwordField.setText("");
	}

	@Override
	protected boolean isEmpty() {
		// TODO �Զ����ɵķ������
		String textFieldString = textField.getText();
		String password = String.valueOf(passwordField.getPassword());
		
		if(StringUtils.isEmpty(textFieldString) == true || StringUtils.isEmpty(password) == true ) {
			JOptionPane.showMessageDialog(null, "�û�ID�������벻��Ϊ��");
			return true;
		}
		
		
		
		return false;
	}

}
