package com.cjl.view;

import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.cjl.Bean.Fruit;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public abstract class SelectJInternalFrame extends JInternalFrame {
	protected JTextField textField;
	protected JTable table;
	protected abstract void selectFruit();
	protected abstract void setSelectFruitById();
	protected abstract void setSelectFruitByName();
	protected abstract void setSelectFruitByPrice();
	protected abstract void setSelectFruitByType();
	protected abstract void fillTable(Fruit fruit);
	protected abstract void fillTable(ArrayList<Fruit> fruits);
	protected abstract void deleteTable();
	protected abstract void showFruit();


	/**
	 * Create the frame.
	 */
	public SelectJInternalFrame() {
		setTitle("\u6C34\u679C\u67E5\u8BE2");
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(52, 10, 66, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//查询
				selectFruit();
			}
		});
		btnNewButton.setBounds(145, 9, 93, 23);
		getContentPane().add(btnNewButton);
		
		JRadioButton idRadio = new JRadioButton("ID");
		idRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//通过id查找
				setSelectFruitById();
			}
		});
		idRadio.setBounds(6, 37, 49, 23);
		getContentPane().add(idRadio);
		
		JRadioButton nameRadio = new JRadioButton("name");
		nameRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSelectFruitByName();
			}
		});
		nameRadio.setBounds(67, 37, 64, 23);
		getContentPane().add(nameRadio);
		
		JRadioButton priceRadio = new JRadioButton("price");
		priceRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSelectFruitByPrice();
			}
		});
		priceRadio.setBounds(145, 37, 66, 23);
		getContentPane().add(priceRadio);
		
		JRadioButton typeRadio = new JRadioButton("type");
		typeRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSelectFruitByType();
			}
		});
		typeRadio.setBounds(213, 37, 66, 23);
		getContentPane().add(typeRadio);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(idRadio);
		buttonGroup.add(nameRadio);
		buttonGroup.add(priceRadio);
		buttonGroup.add(typeRadio);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 72, 434, 198);
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
		
		JButton btnNewButton_1 = new JButton("\u5C55\u793A\u6240\u6709\u6C34\u679C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showFruit();
			}
		});
		btnNewButton_1.setBounds(289, 9, 121, 51);
		getContentPane().add(btnNewButton_1);

	}
}
