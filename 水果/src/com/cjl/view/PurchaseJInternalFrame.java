package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public abstract class PurchaseJInternalFrame extends JInternalFrame {
	protected JTextField idText;
	protected JTextField nameText;
	protected JTextField priceText;
	protected JTextField unitText;
	protected JTextField quantinyText;
	protected JTextField typeText;
	protected abstract void setEmpty(); 
	protected abstract void insertFruit(); 

	

	/**
	 * Create the frame.
	 */
	public PurchaseJInternalFrame() {
		setTitle("\u6C34\u679C\u8FDB\u8D27");
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		idText = new JTextField();
		idText.setBounds(186, 42, 66, 21);
		getContentPane().add(idText);
		idText.setColumns(10);
		
		nameText = new JTextField();
		nameText.setBounds(186, 73, 66, 21);
		getContentPane().add(nameText);
		nameText.setColumns(10);
		
		priceText = new JTextField();
		priceText.setBounds(186, 104, 66, 21);
		getContentPane().add(priceText);
		priceText.setColumns(10);
		
		unitText = new JTextField();
		unitText.setBounds(186, 135, 66, 21);
		getContentPane().add(unitText);
		unitText.setColumns(10);
		
		quantinyText = new JTextField();
		quantinyText.setBounds(186, 166, 66, 21);
		getContentPane().add(quantinyText);
		quantinyText.setColumns(10);
		
		typeText = new JTextField();
		typeText.setBounds(186, 197, 66, 21);
		getContentPane().add(typeText);
		typeText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u6C34\u679CID\uFF1A");
		lblNewLabel.setBounds(122, 45, 54, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u540D\u79F0\uFF1A");
		lblNewLabel_1.setBounds(122, 76, 54, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u4EF7\u683C\uFF1A");
		lblNewLabel_2.setBounds(122, 107, 54, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5355\u4F4D\uFF1A");
		lblNewLabel_3.setBounds(122, 138, 54, 15);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u8FDB\u8D27\u91CF\uFF1A");
		lblNewLabel_4.setBounds(122, 169, 54, 15);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u7C7B\u578B\uFF1A");
		lblNewLabel_5.setBounds(122, 200, 54, 15);
		getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("\u6E05\u7A7A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setEmpty(); 
			}
		});
		btnNewButton.setBounds(302, 134, 93, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u786E\u8BA4\u5F55\u5165");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/////
				insertFruit();
			}
		});
		btnNewButton_1.setBounds(302, 72, 93, 23);
		getContentPane().add(btnNewButton_1);

	}
}
