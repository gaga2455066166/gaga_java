package com.cjl.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cjl.dao.UserDao;
import com.cjl.model.User;
import com.cjl.util.DbUtil;
import com.cjl.util.StringUtil;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LogOnFrm extends JFrame {

	private JPanel contentPane;
	private JTextField userNameTxt;
	private JPasswordField passwordTxt;

	private DbUtil dbUtil = new DbUtil();
	private UserDao userDao = new UserDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogOnFrm frame = new LogOnFrm();
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
	public LogOnFrm() {
		setTitle("\u5546\u5E97\u7BA1\u7406\u5458\u767B\u5F55");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel label = new JLabel("\u5546\u5E97\u4F1A\u5458\u7BA1\u7406\u7CFB\u7EDF");
		label.setFont(new Font("宋体", Font.BOLD, 25));
		label.setIcon(new ImageIcon(
				LogOnFrm.class.getResource("/images/\u5546\u5E97\u4F1A\u5458\u7BA1\u7406\u7CFB\u7EDF.png")));

		JLabel label_1 = new JLabel("\u8D26\u53F7\uFF1A");
		label_1.setFont(new Font("宋体", Font.BOLD, 15));
		label_1.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/\u7528\u6237\u540D.png")));

		JLabel label_2 = new JLabel("\u5BC6\u7801\uFF1A");
		label_2.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/\u5BC6\u7801.png")));
		label_2.setFont(new Font("宋体", Font.BOLD, 15));

		userNameTxt = new JTextField();
		userNameTxt.setColumns(10);
		passwordTxt = new JPasswordField();
		/**
		 * 登录按钮
		 */
		JButton button = new JButton("\u767B\u5F55");
		button.setFont(new Font("宋体", Font.BOLD, 15));
		button.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/\u767B\u5F55.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginActionPerformed(e);
			}
		});
		/**
		 * 重置按钮
		 */
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.setFont(new Font("宋体", Font.BOLD, 15));
		button_1.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/\u91CD\u7F6E.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(201)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(5))
								.addGroup(Alignment.TRAILING,
										gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(label_2).addComponent(label_1))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
														.addComponent(passwordTxt).addComponent(userNameTxt,
																GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))))
						.addGap(208))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(228)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(50).addComponent(button_1, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE).addGap(226)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(101).addComponent(label, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
				.addGap(51)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(label_1).addComponent(
						userNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(label_2).addComponent(
						passwordTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(41).addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE, false).addComponent(button)
						.addComponent(button_1))
				.addGap(123)));
		contentPane.setLayout(gl_contentPane);
		// 设置JFrame居中显示
		this.setLocationRelativeTo(null);
	}

	/**
	 * 登录处理
	 * 
	 * @param e
	 */
	private void loginActionPerformed(ActionEvent evt) {
		// TODO 自动生成的方法存根
		String userName = this.userNameTxt.getText();
		char[] password0 = this.passwordTxt.getPassword();
		String password = String.valueOf(password0);
		if (StringUtil.isEmpty(userName)) {
			JOptionPane.showMessageDialog(null, "用户名不能为空！");
			return;
		}
		if (StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
			return;
		}
		User user = new User(userName, password);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			User currentUser = userDao.login(con, user);
			if (currentUser != null) {
				// JOptionPane.showMessageDialog(null, "登录成功！");
				dispose();
				new MainFrm().setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "用户名或者密码错误！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 重置处理
	 * 
	 * @param e
	 */
	private void resetValueActionPerformed(ActionEvent evt) {
		// TODO 自动生成的方法存根
		this.userNameTxt.setText("");
		this.passwordTxt.setText("");
	}
}
