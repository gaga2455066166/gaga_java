package com.cjl.Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.cjl.Bean.Fruit;
import com.cjl.Service.FruitService;
import com.cjl.Tool.StringUtils;
import com.cjl.view.SelectJInternalFrame;

import jdk.nashorn.internal.ir.Flags;

public class SelectController extends SelectJInternalFrame{
	private int flagSelect = -1;
	private FruitService fruitService = new FruitService();

	@Override
	protected void selectFruit() {
		// TODO 自动生成的方法存根
		if(flagSelect == -1) {
			JOptionPane.showMessageDialog(null, "请先选择通过什么属性进行查询。");
		}
		else if(flagSelect == 1) {
			//通过id查询
			String textFieldString = textField.getText();
			if(StringUtils.isInteger(textFieldString)==true) {
				Integer id = Integer.valueOf(textFieldString);
				Fruit fruit = new Fruit();
				fruit.setId(id);
				Fruit selectFruit = fruitService.selectFruitByIdService(fruit);
				if(selectFruit == null ) {
					JOptionPane.showMessageDialog(null, "找不到该ID的水果的信息");
				}else {
					fillTable(selectFruit);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "请检查输入是否合法");
			}
			
		}
		else if(flagSelect == 2) {
			//通过name查询
			String textFieldString = textField.getText();
			if(StringUtils.isEmpty(textFieldString)!=true) {
				Fruit fruit = new Fruit();
				fruit.setName(textFieldString);
				Fruit selectFruit = fruitService.selectFruitByNameService(fruit);
				if(selectFruit == null ) {
					JOptionPane.showMessageDialog(null, "找不到该名称的水果的信息");
				}else {
					fillTable(selectFruit);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "请检查输入是否合法");
			}
			
		}
		
		else if(flagSelect == 3) {
			//通过price查询
			String textFieldString = textField.getText();
			if(StringUtils.isDouble(textFieldString)==true) {
				Double price = Double.valueOf(textFieldString);
				Fruit fruit = new Fruit();
				fruit.setPrice(price);
				Fruit selectFruit = fruitService.selectFruitByPriceService(fruit);
				if(selectFruit == null ) {
					JOptionPane.showMessageDialog(null, "找不到该价格的水果的信息");
				}else {
					fillTable(selectFruit);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "请检查输入是否合法");
			}
			
		}
		
		else if(flagSelect == 4) {
			//通过type查询
			String textFieldString = textField.getText();
			if(StringUtils.isEmpty(textFieldString)!=true) {
				Fruit fruit = new Fruit();
				fruit.setType(textFieldString);;
				Fruit selectFruit = fruitService.selectFruitByTypeService(fruit);
				if(selectFruit == null ) {
					JOptionPane.showMessageDialog(null, "找不到该类型的水果的信息");
				}else {
					fillTable(selectFruit);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "请检查输入是否合法");
			}
			
		}
		
	}

	@Override
	protected void setSelectFruitById() {
		// TODO 自动生成的方法存根
		flagSelect = 1;
		deleteTable();
		
	}

	@Override
	protected void setSelectFruitByName() {
		// TODO 自动生成的方法存根
		flagSelect = 2;
		deleteTable();
	}

	@Override
	protected void setSelectFruitByPrice() {
		// TODO 自动生成的方法存根
		flagSelect = 3;
		deleteTable();
	}

	@Override
	protected void setSelectFruitByType() {
		// TODO 自动生成的方法存根
		flagSelect = 4;
		deleteTable();
	}

	@Override
	protected void fillTable(Fruit fruit) {
		// TODO 自动生成的方法存根
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0); // 设置成0行
		Vector v=new Vector();
		v.add(fruit.getId());
		v.add(fruit.getName());
		v.add(fruit.getPrice());
		v.add(fruit.getUnit());
		v.add(fruit.getQuantiny());
		v.add(fruit.getType());
		dtm.addRow(v);
	}

	@Override
	protected void deleteTable() {
		// TODO 自动生成的方法存根
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0); // 设置成0行
	}

	@Override
	protected void showFruit() {
		// TODO 自动生成的方法存根
		ArrayList<Fruit> fruits = fruitService.selectAllFruitService();
		fillTable(fruits);
		
	}

	@Override
	protected void fillTable(ArrayList<Fruit> fruits) {
		// TODO 自动生成的方法存根
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0); // 设置成0行
		boolean flag = false;
		Iterator fruitIterator = fruits.iterator();
		while (fruitIterator.hasNext()) {
			flag = true;
			Vector v=new Vector();
			Fruit fruit = (Fruit) fruitIterator.next();
			v.add(fruit.getId());
			v.add(fruit.getName());
			v.add(fruit.getPrice());
			v.add(fruit.getUnit());
			v.add(fruit.getQuantiny());
			v.add(fruit.getType());
			
			dtm.addRow(v);
			
		}
		
	}

}
