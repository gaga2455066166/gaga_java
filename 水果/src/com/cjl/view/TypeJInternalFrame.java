package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.cjl.Bean.Fruit;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public abstract class TypeJInternalFrame extends JInternalFrame {
	protected JTable table;
	protected JTextField oldType;
	protected JTextField newType;
	protected abstract void showFruit();
	protected abstract void updateType();
	protected abstract void deleteType();
	protected abstract boolean isOldEmpty();
	protected abstract boolean isNewEmpty();
	protected abstract void fillTable(ArrayList<Fruit> fruits);



	/**
	 * Create the frame.
	 */
	public TypeJInternalFrame() {
		setTitle("\u7C7B\u522B\u4FEE\u6539");
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u5C55\u793A\u6240\u6709\u6C34\u679C\u7684\u7C7B\u522B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showFruit();
			}
		});
		btnNewButton.setBounds(10, 10, 157, 23);
		getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 105, 434, 165);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"type", "name", "id"
			}
		));
		scrollPane.setViewportView(table);
		
		oldType = new JTextField();
		oldType.setBounds(101, 43, 66, 21);
		getContentPane().add(oldType);
		oldType.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u65E7\u7C7B\u522B\uFF1A");
		lblNewLabel.setBounds(37, 46, 54, 15);
		getContentPane().add(lblNewLabel);
		
		newType = new JTextField();
		newType.setBounds(101, 74, 66, 21);
		getContentPane().add(newType);
		newType.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u65B0\u7C7B\u522B\uFF1A");
		lblNewLabel_1.setBounds(37, 80, 54, 15);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				
				updateType();
			}
		});
		btnNewButton_1.setBounds(192, 43, 66, 52);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5220\u9664\u65E7\u7C7B\u522B");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteType();
			}
		});
		btnNewButton_2.setBounds(300, 42, 108, 53);
		getContentPane().add(btnNewButton_2);

	}
}
