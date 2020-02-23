package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.cjl.dao.ShopMemberDao;
import com.cjl.model.MemberInformation;
import com.cjl.model.ShopMember;
import com.cjl.util.DbUtil;
import com.cjl.util.StringUtil;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class ShopMemberUpdatePhoneInterFrm extends JInternalFrame {
	private JTextField phoneText;
	private JTextField ID;
	private JTextField IdText;

	private int flag = 0;
	private String personId;
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
					ShopMemberUpdatePhoneInterFrm frame = new ShopMemberUpdatePhoneInterFrm();
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
	public ShopMemberUpdatePhoneInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);

		JLabel lblID = new JLabel("I D \uFF1A");

		JLabel label = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\uFF1A");

		JLabel label_1 = new JLabel("\u624B\u673A\u53F7\uFF1A");

		phoneText = new JTextField();
		phoneText.setColumns(10);

		ID = new JTextField();
		ID.setColumns(10);

		IdText = new JTextField();
		IdText.setColumns(10);

		JButton button = new JButton("\u9A8C\u8BC1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textID();
			}
		});

		JButton button_1 = new JButton("\u4FEE\u6539");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmUpdate();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addGap(49)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addComponent(label_1)
								.addComponent(label).addComponent(lblID))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(phoneText, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addComponent(IdText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(ID, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup().addGap(107).addComponent(button))
						.addGroup(groupLayout.createSequentialGroup().addGap(110).addComponent(button_1)))
				.addContainerGap(140, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(76)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblID).addComponent(IdText,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(label).addComponent(ID,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(button).addGap(21)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(label_1).addComponent(
						phoneText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(button_1)
				.addContainerGap(22, Short.MAX_VALUE)));
		getContentPane().setLayout(groupLayout);

	}

	private void textID() {
		// TODO 自动生成的方法存根
		String id0 = this.IdText.getText();
		if (StringUtil.isEmpty(id0)) {
			JOptionPane.showMessageDialog(null, "id不能为空！");
			return;
		}
		personId = this.ID.getText();
		id = Integer.valueOf(id0);

		if (StringUtil.isEmpty(personId)) {
			JOptionPane.showMessageDialog(null, "身份证号不能为空！");
			return;
		}
		MemberInformation member = new MemberInformation(id, null, personId);
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

	private void confirmUpdate() {
		// TODO 自动生成的方法存根
		if (flag == 0) {
			JOptionPane.showMessageDialog(null, "请先通过身份验证！");
			dispose();
		} else {
			String phone = this.phoneText.getText();

			int flags = 0;
			if (flags == 0) {
				MemberInformation member = new MemberInformation(id,phone);
				Connection con = null;
				try {
					con = dbUtil.getCon();
					int n = shopMemberDao.updatePhone(con, member);
					if (n == 1) {
						JOptionPane.showMessageDialog(null, "手机修改成功！");
					} else {
						JOptionPane.showMessageDialog(null, "手机修改错误！");
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
}