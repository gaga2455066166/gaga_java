package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public abstract class UpdateJInternalFrame extends JInternalFrame {
	protected JTextField idText;
	protected JTextField nameText;
	protected JTextField priceText;
	protected JTextField unitText;
	protected JTextField quantinyText;
	protected JTextField typeText;
	protected JTextField textField;
	protected abstract void selectFruit();
	protected abstract void updateFruit();
	protected abstract boolean isEmpty();

	

	/**
	 * Create the frame.
	 */
	public UpdateJInternalFrame() {
		setTitle("\u6C34\u679C\u4FEE\u6539");
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		idText = new JTextField();
		idText.setBounds(157, 23, 66, 21);
		getContentPane().add(idText);
		idText.setColumns(10);
		
		nameText = new JTextField();
		nameText.setBounds(157, 54, 66, 21);
		getContentPane().add(nameText);
		nameText.setColumns(10);
		
		priceText = new JTextField();
		priceText.setBounds(157, 85, 66, 21);
		getContentPane().add(priceText);
		priceText.setColumns(10);
		
		unitText = new JTextField();
		unitText.setBounds(157, 116, 66, 21);
		getContentPane().add(unitText);
		unitText.setColumns(10);
		
		quantinyText = new JTextField();
		quantinyText.setBounds(157, 147, 66, 21);
		getContentPane().add(quantinyText);
		quantinyText.setColumns(10);
		
		typeText = new JTextField();
		typeText.setBounds(157, 178, 66, 21);
		getContentPane().add(typeText);
		typeText.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(293, 40, 66, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectFruit();
			}
		});
		btnNewButton.setBounds(293, 84, 93, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u6C34\u679CID\uFF1A");
		lblNewLabel.setBounds(79, 26, 68, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u540D\u79F0\uFF1A");
		lblNewLabel_1.setBounds(79, 57, 54, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u4EF7\u683C\uFF1A");
		lblNewLabel_2.setBounds(79, 88, 54, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5355\u4F4D\uFF1A");
		lblNewLabel_3.setBounds(79, 119, 54, 15);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u6570\u91CF\uFF1A");
		lblNewLabel_4.setBounds(79, 150, 54, 15);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u7C7B\u578B\uFF1A");
		lblNewLabel_5.setBounds(79, 181, 54, 15);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u6C34\u679CID\uFF1A");
		lblNewLabel_6.setBounds(293, 10, 54, 15);
		getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("\u786E\u8BA4\u4FEE\u6539");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateFruit();
			}
		});
		btnNewButton_1.setBounds(293, 177, 93, 23);
		getContentPane().add(btnNewButton_1);

	}
}
