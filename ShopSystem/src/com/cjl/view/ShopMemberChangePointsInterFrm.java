package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.cjl.dao.ShopMemberDao;
import com.cjl.model.MemberInformation;
import com.cjl.util.DbUtil;
import com.cjl.util.StringUtil;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ShopMemberChangePointsInterFrm extends JInternalFrame {
	private JTextField pointsText;
	private JTextField idText;
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
					ShopMemberChangePointsInterFrm frame = new ShopMemberChangePointsInterFrm();
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
	public ShopMemberChangePointsInterFrm() {
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		
		pointsText = new JTextField();
		pointsText.setColumns(10);
		
		idText = new JTextField();
		idText.setColumns(10);
		
		JLabel lblID = new JLabel("     I D\uFF1A");
		
		JLabel label_1 = new JLabel("    \u5BC6\u7801\uFF1A");
		
		passwordText = new JPasswordField();
		
		JLabel label_2 = new JLabel("\u7269\u54C1\u79EF\u5206\uFF1A");
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmChange();
			}
		});
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(83)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
						.addComponent(label_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
						.addComponent(lblID, Alignment.LEADING))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addComponent(passwordText, Alignment.LEADING, 187, 187, 187)
						.addComponent(idText, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
						.addComponent(pointsText, Alignment.LEADING, 187, 187, 187))
					.addGap(88))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblID))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(pointsText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1)
						.addComponent(button))
					.addContainerGap(94, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	private void confirmChange() {
		// TODO 自动生成的方法存根
		int id;
		double points;
		String id0 = this.idText.getText();
		String points0 = this.pointsText.getText();
		char[] password0 = this.passwordText.getPassword();
		if (StringUtil.isEmpty(id0)) {
			JOptionPane.showMessageDialog(null, "id不能为空！");
			return;
		}
		if (StringUtil.isEmpty(points0)) {
			JOptionPane.showMessageDialog(null, "提升的等级不能为空！");
			return;
		}
		String password = String.valueOf(password0);
		if (StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
			return;
		}
		id = Integer.valueOf(id0);
		points = Double.valueOf(points0);
		MemberInformation member = new MemberInformation(id, password, points);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int n = shopMemberDao.updatePoints(con,member);
			if (n==1) {
				JOptionPane.showMessageDialog(null, "物品兑换成功！");
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
		this.pointsText.setText("");
	}
}
