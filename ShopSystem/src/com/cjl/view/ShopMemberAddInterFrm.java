package com.cjl.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
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

public class ShopMemberAddInterFrm extends JInternalFrame {
	private JTextField nameText;
	private JTextField sexText;
	private JTextField ageText;
	private JTextField phoneText;
	private JTextField addressText;
	private JPasswordField passwordText;
	private JTextField moneyText;

	private DbUtil dbUtil = new DbUtil();
	private ShopMemberDao shopMemberDao = new ShopMemberDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMemberAddInterFrm frame = new ShopMemberAddInterFrm();
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
	public ShopMemberAddInterFrm() {
		setClosable(true);
		setIconifiable(true);
		setTitle("\u5546\u5E97\u4F1A\u5458\u7533\u8BF7");
		setBounds(100, 100, 500, 400);

		JLabel label = new JLabel("\u59D3\u540D\uFF1A");
		label.setIcon(new ImageIcon(ShopMemberAddInterFrm.class.getResource("/images/\u7528\u6237\u540D.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 12));

		JLabel label_1 = new JLabel("\u6027\u522B\uFF1A");
		label_1.setIcon(new ImageIcon(ShopMemberAddInterFrm.class.getResource("/images/\u6027\u522B.png")));

		JLabel label_2 = new JLabel("\u5E74\u9F84\uFF1A");
		label_2.setIcon(new ImageIcon(ShopMemberAddInterFrm.class.getResource("/images/\u5E74\u9F84.png")));

		JLabel label_3 = new JLabel("\u8BC1\u4EF6\uFF1A");
		label_3.setIcon(new ImageIcon(ShopMemberAddInterFrm.class.getResource("/images/\u4F1A\u5458\u4FE1\u606F\u67E5\u8BE2.png")));

		JLabel label_4 = new JLabel("\u5730\u5740\uFF1A");
		label_4.setIcon(new ImageIcon(ShopMemberAddInterFrm.class.getResource("/images/\u8054\u7CFB\u5730\u5740.png")));

		JLabel label_5 = new JLabel("\u4F1A\u5458\u5BC6\u7801\uFF1A");
		label_5.setIcon(new ImageIcon(ShopMemberAddInterFrm.class.getResource("/images/\u5BC6\u7801.png")));

		JLabel label_6 = new JLabel("\u5145\u503C\u91D1\u989D\uFF1A");
		label_6.setIcon(new ImageIcon(ShopMemberAddInterFrm.class.getResource("/images/\u79EF\u5206\u4F59\u989D.png")));

		JLabel label_7 = new JLabel("\u6B22\u8FCE\u60A8\uFF0C\u6211\u4EEC\u7684\u65B0\u4F1A\u5458\uFF01");
		label_7.setFont(new Font("宋体", Font.BOLD, 25));
		label_7.setIcon(new ImageIcon(
				ShopMemberAddInterFrm.class.getResource("/images/\u6B22\u8FCE\u7533\u8BF7\u4F1A\u5458.png")));
		/**
		 * 文本框
		 */
		nameText = new JTextField();
		nameText.setColumns(10);

		sexText = new JTextField();
		sexText.setColumns(10);

		ageText = new JTextField();
		ageText.setColumns(10);

		phoneText = new JTextField();
		phoneText.setColumns(10);

		addressText = new JTextField();
		addressText.setColumns(10);

		passwordText = new JPasswordField();

		moneyText = new JTextField();
		moneyText.setColumns(10);

		JLabel lblNewLabel = new JLabel("<html><body><p align=\"center\">★此卡限原主或原主授权使用" + "<br/>★此卡每充值 100 赠送 5 积分"
				+ "<br/>★此卡购物每次满10 积1积分" + "<br/>★此卡积分可换对应等级物品" + "<br/>★此卡积分可用于提升卡等级" + "<br/>★此卡每20积分提升一个等级"
				+ "<br/>★此卡最终解释权归本店所有</p></body></html>");

		JLabel lblNewLabel_1 = new JLabel("\u6CE8\u610F\u4E8B\u9879:");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 15));
		lblNewLabel_1.setIcon(
				new ImageIcon(ShopMemberAddInterFrm.class.getResource("/images/\u6CE8\u610F\u4E8B\u9879.png")));

		JButton btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisteredActionPerformed(e);
			}
		});
		btnNewButton.setIcon(
				new ImageIcon(ShopMemberAddInterFrm.class.getResource("/images/\u4F1A\u5458\u7533\u8BF71.png")));

		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(ShopMemberAddInterFrm.class.getResource("/images/\u91CD\u7F6E.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap(20, Short.MAX_VALUE)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup().addComponent(label_5)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(passwordText,
														GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup().addComponent(label_4)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(addressText,
														GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup().addComponent(label_3)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(phoneText,
														GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup().addComponent(label_2)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(ageText,
														GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(label).addComponent(label_1))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(sexText, GroupLayout.PREFERRED_SIZE, 144,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(nameText, GroupLayout.PREFERRED_SIZE, 144,
																GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup().addComponent(label_6)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(moneyText,
														GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup().addGap(27)
												.addComponent(btnNewButton)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnNewButton_1)))
								.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup().addComponent(label_7).addGap(49)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(19).addComponent(label_7)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(label).addComponent(
								nameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(label_1)
								.addComponent(sexText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(label_2)
								.addComponent(ageText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(label_3)
								.addComponent(phoneText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(label_4)
								.addComponent(addressText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(label_5)
								.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(label_6)
								.addComponent(moneyText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton)
								.addComponent(btnNewButton_1)))
						.addGroup(groupLayout.createSequentialGroup().addGap(28).addComponent(lblNewLabel_1)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblNewLabel,
										GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(groupLayout);

	}

	private void resetValueActionPerformed() {
		/**
		 * 重置
		 */
		this.nameText.setText("");
		this.sexText.setText("");
		this.ageText.setText("");
		this.phoneText.setText("");
		this.addressText.setText("");
		this.moneyText.setText("");
		this.passwordText.setText("");

	}

	private void RegisteredActionPerformed(ActionEvent evt) {
		// TODO 自动生成的方法存根
		if (StringUtil.isEmpty(this.moneyText.getText())) {
			JOptionPane.showMessageDialog(null, "充值金额不能为空！");
			return;
		}
		if (StringUtil.isEmpty(this.ageText.getText())) {
			JOptionPane.showMessageDialog(null, "年龄不能为空！");
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
		int age = Integer.valueOf(this.ageText.getText()).intValue();// age
		String phoneString = this.phoneText.getText();//
		String addressString = this.addressText.getText();
		double money = Double.valueOf(this.moneyText.getText()).doubleValue();
		String password = String.valueOf(this.passwordText.getPassword());
		double points = 5 * (money % 100);
		int flages = 0;
		if (StringUtil.isSex(sexString) != true) {
			flages++;
			JOptionPane.showMessageDialog(null, "性别不合理！");
		}
		if (flages == 0) {
			ShopMember shopMember = new ShopMember(nameString, sexString, age, phoneString, addressString, password, 1,
					points, money, 0);
			Connection con = null;
			try {
				con = dbUtil.getCon();
				int n = shopMemberDao.add(con, shopMember);
				if (n == 1) {
					JOptionPane.showMessageDialog(null, "会员申请添加成功！");
					resetValueActionPerformed();
				} else {
					JOptionPane.showMessageDialog(null, "会员申请添加失败！");
				}
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "会员申请添加失败！");
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
