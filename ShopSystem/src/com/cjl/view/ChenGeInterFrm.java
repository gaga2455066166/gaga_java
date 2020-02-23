package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ChenGeInterFrm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChenGeInterFrm frame = new ChenGeInterFrm();
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
	public ChenGeInterFrm() {
		getContentPane().setForeground(Color.WHITE);
		setClosable(true);
		setTitle("\u5173\u4E8E\u6211\u4EEC");
		setBounds(100, 100, 450, 300);
		
		JLabel lbljava = new JLabel("\u5546\u5E97\u4F1A\u5458\u7BA1\u7406\u7CFB\u7EDF");
		lbljava.setFont(new Font("ËÎÌו", Font.BOLD, 30));
		lbljava.setIcon(new ImageIcon(ChenGeInterFrm.class.getResource("/images/\u56E2\u961F.png")));
		
		JLabel label = new JLabel("36_\u6797\u65ED\u4E1C");
		label.setIcon(new ImageIcon(ChenGeInterFrm.class.getResource("/images/\u7528\u6237\u540D.png")));
		
		JLabel label_1 = new JLabel("55_\u9648\u8FDB\u9F99");
		label_1.setIcon(new ImageIcon(ChenGeInterFrm.class.getResource("/images/\u7528\u6237\u540D.png")));
		
		JLabel label_2 = new JLabel("18_\u9F9A\u4F73\u714C");
		label_2.setIcon(new ImageIcon(ChenGeInterFrm.class.getResource("/images/\u7528\u6237\u540D.png")));
		
		JLabel label_3 = new JLabel("33_\u9EC4\u68EE\u5E7F");
		label_3.setIcon(new ImageIcon(ChenGeInterFrm.class.getResource("/images/\u7528\u6237\u540D.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lbljava)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addComponent(label, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18)))
					.addGap(41))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(lbljava)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(label_2)
						.addComponent(label_3)
						.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(116))
		);
		getContentPane().setLayout(groupLayout);

	}
}
