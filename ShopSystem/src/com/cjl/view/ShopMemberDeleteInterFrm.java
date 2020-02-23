package com.cjl.view;

import java.awt.EventQueue;
import java.awt.Font;
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
import com.cjl.model.ShopMember;
import com.cjl.util.DbUtil;
import com.cjl.util.StringUtil;
import javax.swing.ImageIcon;

public class ShopMemberDeleteInterFrm extends JInternalFrame {
	private JTextField nameText;
	private JTextField sexText;
	private JTextField idText;
	private JTextField phoneText;
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
					ShopMemberDeleteInterFrm frame = new ShopMemberDeleteInterFrm();
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
	public ShopMemberDeleteInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);

		nameText = new JTextField();
		nameText.setColumns(10);

		sexText = new JTextField();
		sexText.setColumns(10);

		idText = new JTextField();
		idText.setColumns(10);

		phoneText = new JTextField();
		phoneText.setColumns(10);

		passwordText = new JPasswordField();

		JLabel label_1 = new JLabel("\u4F1A\u5458\u5BC6\u7801\uFF1A");
		label_1.setIcon(new ImageIcon(ShopMemberDeleteInterFrm.class.getResource("/images/\u5BC6\u7801.png")));

		JLabel label_3 = new JLabel("\u624B\u673A\uFF1A");
		label_3.setIcon(new ImageIcon(ShopMemberDeleteInterFrm.class.getResource("/images/\u624B\u673A\u53F7\u7801.png")));

		JLabel lblId = new JLabel("I D \uFF1A");
		lblId.setIcon(new ImageIcon(ShopMemberDeleteInterFrm.class.getResource("/images/id.png")));

		JLabel label_5 = new JLabel("\u6027\u522B\uFF1A");
		label_5.setIcon(new ImageIcon(ShopMemberDeleteInterFrm.class.getResource("/images/\u6027\u522B.png")));

		JLabel label_6 = new JLabel("\u59D3\u540D\uFF1A");
		label_6.setIcon(new ImageIcon(ShopMemberDeleteInterFrm.class.getResource("/images/\u7528\u6237\u540D.png")));
		label_6.setFont(new Font("宋体", Font.PLAIN, 12));

		JButton btnNewButton = new JButton("\u91CD\u7F6E");
		btnNewButton.setIcon(new ImageIcon(ShopMemberDeleteInterFrm.class.getResource("/images/\u91CD\u7F6E.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed();
			}
		});

		JButton button = new JButton("\u786E\u8BA4\u6CE8\u9500");
		button.setIcon(new ImageIcon(ShopMemberDeleteInterFrm.class.getResource("/images/\u4F1A\u5458\u6CE8\u95001.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteActionPerformed(e);
			}
		});

		JLabel lblNewLabel_2 = new JLabel("<html><body><p align=\"center\">★此卡限原主或原主授权使用" + "<br/>★此卡每充值 100 赠送 5 积分"
				+ "<br/>★此卡购物每次满10 积1积分" + "<br/>★此卡积分可换对应等级物品" + "<br/>★此卡积分可用于提升卡等级" + "<br/>★此卡每20积分提升一个等级"
				+ "<br/>★此卡最终解释权归本店所有</p></body></html>");

		JLabel lblNewLabel_3 = new JLabel("\u4F1A\u5458\u6CE8\u9500");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(35, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING,
										groupLayout.createSequentialGroup().addComponent(lblId)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(idText,
														GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING,
										groupLayout.createSequentialGroup().addComponent(label_3)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(phoneText,
														GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
								.addGroup(
										Alignment.TRAILING,
										groupLayout.createSequentialGroup().addComponent(label_5)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(sexText,
														GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING,
										groupLayout.createSequentialGroup().addComponent(label_6)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(nameText,
														GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING,
										groupLayout.createSequentialGroup().addComponent(label_1)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(passwordText,
														GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING,
										groupLayout.createSequentialGroup().addComponent(button).addGap(14)))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(29).addComponent(lblNewLabel_2,
										GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup().addGap(12).addComponent(btnNewButton)))
						.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup().addGap(192).addComponent(lblNewLabel_3)
						.addContainerGap(194, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addGap(24).addComponent(lblNewLabel_3).addGap(39)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_2, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(nameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 16,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(sexText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 16,
												GroupLayout.PREFERRED_SIZE))
								.addGap(10)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 16,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(phoneText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 16,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(passwordText, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 16,
												GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(ComponentPlacement.UNRELATED).addGroup(groupLayout
						.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton).addComponent(button))
				.addGap(26)));
		getContentPane().setLayout(groupLayout);

	}

	private void resetValueActionPerformed() {
		// TODO 自动生成的方法存根
		/**
		 * 重置
		 */
		this.nameText.setText("");
		this.sexText.setText("");
		this.idText.setText("");
		this.phoneText.setText("");
		this.passwordText.setText("");
	}

	private void DeleteActionPerformed(ActionEvent evt) {
		// TODO 自动生成的方法存根
		if (StringUtil.isEmpty(this.idText.getText())) {
			JOptionPane.showMessageDialog(null, "Id不能为空！");
			return;
		}
		if (StringUtil.isEmpty(this.nameText.getText())) {
			JOptionPane.showMessageDialog(null, "用户名不能为空！");
			return;
		}
		if (StringUtil.isEmpty(this.sexText.getText())) {
			JOptionPane.showMessageDialog(null, "性别不能为空！");
			return;
		}
		if (StringUtil.isEmpty(this.phoneText.getText())) {
			JOptionPane.showMessageDialog(null, "身份证号不能为空！");
			return;
		}
		if (StringUtil.isEmpty(String.valueOf(this.passwordText.getPassword()))) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
			return;
		}
		String nameString = this.nameText.getText();// name
		String sexString = this.sexText.getText();// sex
		int id = Integer.valueOf(this.idText.getText()).intValue();// id
		String phoneString = this.phoneText.getText();//
		String password = String.valueOf(this.passwordText.getPassword());
		ShopMember shopMember = new ShopMember(nameString, sexString, phoneString, password, id);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int n = shopMemberDao.delete(con, shopMember);
			if (n == 1) {
				JOptionPane.showMessageDialog(null, "会员注销成功！");
				resetValueActionPerformed();
			} else {
				JOptionPane.showMessageDialog(null, "会员注销失败！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "会员注销！");
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
