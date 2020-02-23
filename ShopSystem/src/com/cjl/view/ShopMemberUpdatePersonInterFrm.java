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
import com.cjl.model.PersonalInformation;
import com.cjl.model.ShopMember;
import com.cjl.util.DbUtil;
import com.cjl.util.StringUtil;

public class ShopMemberUpdatePersonInterFrm extends JInternalFrame {
	private JTextField idText;
	private JTextField nameText;
	private JTextField sexText;
	private JTextField ageText;
	private JTextField addressText;
	private JPasswordField passwordText;

	private String password;
	private int id;

	private DbUtil dbUtil = new DbUtil();
	private ShopMemberDao shopMemberDao = new ShopMemberDao();
	private int flag = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMemberUpdatePersonInterFrm frame = new ShopMemberUpdatePersonInterFrm();
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
	public ShopMemberUpdatePersonInterFrm() {
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 401);

		JLabel lblNewLabel = new JLabel("\u4E2A\u4EBA\u4FE1\u606F\u4FEE\u6539");

		JLabel lblID = new JLabel("I D \uFF1A");

		JLabel label = new JLabel("\u4F1A\u5458\u5BC6\u7801\uFF1A");

		JButton button1 = new JButton("\u9A8C\u8BC1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 验证
				testId(e);

			}
		});

		JButton button2 = new JButton("\u91CD\u7F6E");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed1();
			}
		});

		idText = new JTextField();
		idText.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D\uFF1A");

		nameText = new JTextField();
		nameText.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("\u6027\u522B\uFF1A");

		sexText = new JTextField();
		sexText.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("\u5E74\u9F84\uFF1A");

		JLabel lblNewLabel_5 = new JLabel("\u5730\u5740\uFF1A");

		ageText = new JTextField();
		ageText.setColumns(10);

		addressText = new JTextField();
		addressText.setColumns(10);

		JButton button4 = new JButton("\u91CD\u7F6E");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed2();
			}
		});

		JButton button3 = new JButton("\u4FEE\u6539");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmUpdate();
			}
		});

		passwordText = new JPasswordField();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(0)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(165).addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup().addGap(42)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addComponent(label)
										.addComponent(lblID).addComponent(lblNewLabel_2).addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_4).addComponent(lblNewLabel_5))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(passwordText, 138, 138, 138)
										.addComponent(addressText, 138, 138, 138).addComponent(idText, 138, 138, 138)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(button1, GroupLayout.PREFERRED_SIZE, 67,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(button2, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
										.addComponent(nameText, 138, 138, 138).addComponent(sexText, 138, 138, 138)
										.addComponent(ageText, 138, 138, 138)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(button3, GroupLayout.PREFERRED_SIZE, 67,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(button4,
														GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)))))
				.addGap(209)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(20).addComponent(lblNewLabel).addGap(37)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblID))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(label).addComponent(
								passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout
								.createParallelGroup(Alignment.BASELINE).addComponent(button2).addComponent(button1))
						.addGap(27)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(nameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(sexText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ageText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_5)
								.addComponent(addressText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout
								.createParallelGroup(Alignment.BASELINE).addComponent(button3).addComponent(button4))
						.addContainerGap(58, Short.MAX_VALUE)));
		getContentPane().setLayout(groupLayout);

	}

	private void confirmUpdate() {
		// TODO 自动生成的方法存根
		if (flag == 0) {
			JOptionPane.showMessageDialog(null, "请先通过身份验证！");
			dispose();
		} else {
			
			String name = this.nameText.getText();
			String sex = this.sexText.getText();
			int age = Integer.valueOf(this.ageText.getText());
			String address = this.addressText.getText();
			int flags = 0;
			if (StringUtil.isSex(sex) != true) {
				flags++;
				JOptionPane.showMessageDialog(null, "性别不合理");
			}
			if (StringUtil.isAge(age) != true) {
				flags++;
				JOptionPane.showMessageDialog(null, "年龄不合理");

			}
			if (flags == 0) {

				PersonalInformation person = new PersonalInformation(name, sex, age, null, address);
				MemberInformation member = new MemberInformation(id, password);
				Connection con = null;
				try {
					con = dbUtil.getCon();
					int n = shopMemberDao.updatePerson(con, person, member);
					if (n == 1) {
						JOptionPane.showMessageDialog(null, "会员信息修改成功！");
					} else {
						JOptionPane.showMessageDialog(null, "会员信息修改错误！");
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

	private void testId(ActionEvent evt) {
		// TODO 自动生成的方法存根
		String id0 = this.idText.getText();
		char[] password0 = this.passwordText.getPassword();
		password = String.valueOf(password0);
		id = Integer.valueOf(id0);
		if (StringUtil.isEmpty(id0)) {
			JOptionPane.showMessageDialog(null, "id不能为空！");
			return;
		}
		if (StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
			return;
		}
		ShopMember member = new ShopMember(id, password);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ShopMember currentUser = shopMemberDao.loginId(con, member);
			if (currentUser != null) {
				flag = 1;
				JOptionPane.showMessageDialog(null, "身份验证成功！");
			} else {
				JOptionPane.showMessageDialog(null, "ID或者密码错误！");
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
		// this.phoneText.setText("");
		this.nameText.setText("");
		this.sexText.setText("");
		this.ageText.setText("");
		this.addressText.setText("");
	}

	private void resetValueActionPerformed1() {
		// TODO 自动生成的方法存根
		this.idText.setText("");
		this.passwordText.setText("");

	}
}
