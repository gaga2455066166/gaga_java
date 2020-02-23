package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.cjl.dao.ShopMemberDao;
import com.cjl.model.MemberInformation;
import com.cjl.util.DbUtil;
import com.cjl.util.StringUtil;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class ShopMemberRechargeInterFrm extends JInternalFrame {
	private JTextField idText;
	private JTextField balanceText;
	private JPasswordField passwordText;
	
	private DbUtil dbUtil = new DbUtil();
	private ShopMemberDao shopMemberDao = new ShopMemberDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMemberRechargeInterFrm frame = new ShopMemberRechargeInterFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShopMemberRechargeInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("    I D \uFF1A");
		
		JLabel lblNewLabel_1 = new JLabel("    \u5BC6\u7801\uFF1A");
		
		JLabel lblNewLabel_2 = new JLabel("\u5145\u503C\u91D1\u989D\uFF1A");
		
		idText = new JTextField();
		idText.setColumns(10);
		
		balanceText = new JTextField();
		balanceText.setColumns(10);
		
		passwordText = new JPasswordField();
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmRechange();
			}
		});
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(113)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addGap(18)
									.addComponent(balanceText))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(18)
									.addComponent(idText))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(139)
							.addComponent(btnNewButton)
							.addGap(42)
							.addComponent(btnNewButton_1)))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(87)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(balanceText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

	private void confirmRechange() {
		// TODO 自动生成的方法存根
		int id;
		double balance;
		String id0 = this.idText.getText();
		String balance0 = this.balanceText.getText();
		char[] password0 = this.passwordText.getPassword();
		if (StringUtil.isEmpty(id0)) {
			JOptionPane.showMessageDialog(null, "id不能为空！");
			return;
		}
		if (StringUtil.isEmpty(balance0)) {
			JOptionPane.showMessageDialog(null, "充值金额不能为空！");
			return;
		}
		String password = String.valueOf(password0);
		if (StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
			return;
		}
		id = Integer.valueOf(id0);
		balance = Double.valueOf(balance0);
		MemberInformation member = new MemberInformation(balance, id, password);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int n = shopMemberDao.updateBalance(con,member);
			if (n==1) {
				JOptionPane.showMessageDialog(null, "充值成功！");
			} 
			else {
				JOptionPane.showMessageDialog(null, "请检查id或者密码是否错误");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void resetValueActionPerformed() {
		// TODO 自动生成的方法存根
		this.idText.setText("");
		this.passwordText.setText("");
		this.balanceText.setText("");
	}

}
