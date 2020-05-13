package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import com.cjl.Bean.Fruit;

public abstract class CleanJInternalFrame extends JInternalFrame {
	protected JTextField textField;
	protected JTable table;
	protected JScrollPane scrollPane;
	protected abstract void selectFruit();
	protected abstract void fillTable(Fruit fruit);
	protected abstract void deleteFruit();

	

	/**
	 * Create the frame.
	 */
	public CleanJInternalFrame() {
		setClosable(true);
		setTitle("\u6C34\u679C\u6E05\u7406");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(93, 7, 89, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u6C34\u679C\u7F16\u53F7\uFF1A");
		lblNewLabel.setBounds(10, 10, 78, 15);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectFruit();
			}
		});
		btnNewButton.setBounds(207, 6, 93, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u786E\u8BA4\u6E05\u7406");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteFruit();
			}
		});
		btnNewButton_1.setBounds(320, 6, 93, 23);
		getContentPane().add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 42, 414, 191);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "name", "price", "unit", "quantiny", "type"
			}
		));
		scrollPane.setViewportView(table);
	}
}
