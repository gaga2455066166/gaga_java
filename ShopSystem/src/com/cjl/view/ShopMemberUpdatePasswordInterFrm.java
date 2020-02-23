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
import com.cjl.model.ShopMember;
import com.cjl.util.DbUtil;
import com.cjl.util.StringUtil;

public class ShopMemberUpdatePasswordInterFrm extends JInternalFrame {
	private JTextField idText;
	private JTextField phoneText;
	private JPasswordField passwordText;

	private int flag = 0;
	private String phone;
	private int id;

	private DbUtil dbUtil = new DbUtil();
	private ShopMemberDao shopMemberDao = new ShopMemberDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMemberUpdatePasswordInterFrm frame = new ShopMemberUpdatePasswordInterFrm();
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
	public ShopMemberUpdatePasswordInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);

		JLabel lblNewLabel = new JLabel("I D\uFF1A");

		JLabel lblNewLabel_1 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\uFF1A");

		idText = new JTextField();
		idText.setColumns(10);

		phoneText = new JTextField();
		phoneText.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\u65B0\u5BC6\u7801\uFF1A");

		JButton btnNewButton = new JButton("\u9A8C\u8BC1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testPhone();
			}
		});

		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed1();
			}
		});

		JButton btnNewButton_2 = new JButton("\u4FEE\u6539");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmUpdate();
			}
		});

		JButton btnNewButton_3 = new JButton("\u91CD\u7F6E");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed2();
			}
		});

		passwordText = new JPasswordField();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(91)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup().addComponent(btnNewButton_2).addGap(18)
								.addComponent(btnNewButton_3))
						.addGroup(groupLayout.createSequentialGroup().addComponent(btnNewButton).addGap(18)
								.addComponent(btnNewButton_1))
						.addGroup(groupLayout.createSequentialGroup().addComponent(lblNewLabel_2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(passwordText, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING,
												groupLayout.createSequentialGroup().addComponent(lblNewLabel)
														.addPreferredGap(ComponentPlacement.UNRELATED))
										.addGroup(groupLayout.createSequentialGroup().addComponent(lblNewLabel_1)
												.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(phoneText).addComponent(idText, 118, 118, Short.MAX_VALUE))))
				.addGap(185)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(81)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel).addComponent(
						idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1).addComponent(
						phoneText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2).addComponent(
						passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton_3)
						.addComponent(btnNewButton_2))
				.addContainerGap(44, Short.MAX_VALUE)));
		getContentPane().setLayout(groupLayout);

	}

	private void confirmUpdate() {
		// TODO 自动生成的方法存根
		if (flag == 0) {
			JOptionPane.showMessageDialog(null, "请先通过身份验证！");
			dispose();
		} else {
			char[] password0 = this.passwordText.getPassword();
			String password = String.valueOf(password0);
			int flags = 0;
			if (StringUtil.isPassword(password) != true) {
				flags++;
				JOptionPane.showMessageDialog(null, "密码不合理");
			}
			if (flags == 0) {
				MemberInformation member = new MemberInformation(id, password, phone);
				Connection con = null;
				try {
					con = dbUtil.getCon();
					int n = shopMemberDao.updatePassword(con, member);
					if (n == 1) {
						JOptionPane.showMessageDialog(null, "密码修改成功！");
					} else {
						JOptionPane.showMessageDialog(null, "密码修改错误！");
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
		}
	}

	private void testPhone() {
		// TODO 自动生成的方法存根
		String id0 = this.idText.getText();
		if (StringUtil.isEmpty(id0)) {
			JOptionPane.showMessageDialog(null, "id不能为空！");
			return;
		}
		phone = this.phoneText.getText();
		id = Integer.valueOf(id0);

		if (StringUtil.isEmpty(phone)) {
			JOptionPane.showMessageDialog(null, "身份证号不能为空！");
			return;
		}
		MemberInformation member = new MemberInformation(id, null, phone);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ShopMember currentUser = shopMemberDao.loginPhone(con, member);
			if (currentUser != null) {
				flag = 1;
				JOptionPane.showMessageDialog(null, "身份验证成功！");
			} else {
				JOptionPane.showMessageDialog(null, "ID或者身份证号错误！");
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

	private void resetValueActionPerformed2() {
		// TODO 自动生成的方法存根
		this.passwordText.setText("");
	}

	private void resetValueActionPerformed1() {
		// TODO 自动生成的方法存根
		this.idText.setText("");
		this.phoneText.setText("");

	}
}
