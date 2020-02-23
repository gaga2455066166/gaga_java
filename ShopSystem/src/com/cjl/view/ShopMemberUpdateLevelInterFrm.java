package com.cjl.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.cjl.dao.ShopMemberDao;
import com.cjl.model.MemberInformation;
import com.cjl.util.DbUtil;
import com.cjl.util.StringUtil;

public class ShopMemberUpdateLevelInterFrm extends JInternalFrame {
	private JTextField idText;
	private JPasswordField passwordText;
	private JTextField levelText;
	
	
	private DbUtil dbUtil = new DbUtil();
	private ShopMemberDao shopMemberDao = new ShopMemberDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMemberUpdateLevelInterFrm frame = new ShopMemberUpdateLevelInterFrm();
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
	public ShopMemberUpdateLevelInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("I D\uFF1A");
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		
		JLabel lblNewLabel_2 = new JLabel("\u63D0\u5347\u7B49\u7EA7\uFF1A");
		
		idText = new JTextField();
		idText.setColumns(10);
		
		passwordText = new JPasswordField();
		
		levelText = new JTextField();
		levelText.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4\u53D8\u66F4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comfirmUpdate();
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
					.addGap(102)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(levelText, 94, 94, 94))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(idText, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
								.addComponent(passwordText, 126, 126, 126))))
					.addContainerGap(160, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(76)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(levelText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

	private void comfirmUpdate() {
		// TODO 自动生成的方法存根
		int id,level;
		String id0 = this.idText.getText();
		String level0 = this.levelText.getText();
		char[] password0 = this.passwordText.getPassword();
		if (StringUtil.isEmpty(id0)) {
			JOptionPane.showMessageDialog(null, "id不能为空！");
			return;
		}
		if (StringUtil.isEmpty(level0)) {
			JOptionPane.showMessageDialog(null, "提升的等级不能为空！");
			return;
		}
		String password = String.valueOf(password0);
		if (StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
			return;
		}
		
		id = Integer.valueOf(id0);
		level = Integer.valueOf(level0);
		MemberInformation member = new MemberInformation(id, password,level);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int n = shopMemberDao.updateLevel(con,member);
			if (n==1) {
				JOptionPane.showMessageDialog(null, "等级提升修改成功！");
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
		this.levelText.setText("");
	}

}
