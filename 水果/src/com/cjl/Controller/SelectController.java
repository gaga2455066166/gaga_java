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
		// TODO �Զ����ɵķ������
		if(flagSelect == -1) {
			JOptionPane.showMessageDialog(null, "����ѡ��ͨ��ʲô���Խ��в�ѯ��");
		}
		else if(flagSelect == 1) {
			//ͨ��id��ѯ
			String textFieldString = textField.getText();
			if(StringUtils.isInteger(textFieldString)==true) {
				Integer id = Integer.valueOf(textFieldString);
				Fruit fruit = new Fruit();
				fruit.setId(id);
				Fruit selectFruit = fruitService.selectFruitByIdService(fruit);
				if(selectFruit == null ) {
					JOptionPane.showMessageDialog(null, "�Ҳ�����ID��ˮ������Ϣ");
				}else {
					fillTable(selectFruit);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "���������Ƿ�Ϸ�");
			}
			
		}
		else if(flagSelect == 2) {
			//ͨ��name��ѯ
			String textFieldString = textField.getText();
			if(StringUtils.isEmpty(textFieldString)!=true) {
				Fruit fruit = new Fruit();
				fruit.setName(textFieldString);
				Fruit selectFruit = fruitService.selectFruitByNameService(fruit);
				if(selectFruit == null ) {
					JOptionPane.showMessageDialog(null, "�Ҳ��������Ƶ�ˮ������Ϣ");
				}else {
					fillTable(selectFruit);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "���������Ƿ�Ϸ�");
			}
			
		}
		
		else if(flagSelect == 3) {
			//ͨ��price��ѯ
			String textFieldString = textField.getText();
			if(StringUtils.isDouble(textFieldString)==true) {
				Double price = Double.valueOf(textFieldString);
				Fruit fruit = new Fruit();
				fruit.setPrice(price);
				Fruit selectFruit = fruitService.selectFruitByPriceService(fruit);
				if(selectFruit == null ) {
					JOptionPane.showMessageDialog(null, "�Ҳ����ü۸��ˮ������Ϣ");
				}else {
					fillTable(selectFruit);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "���������Ƿ�Ϸ�");
			}
			
		}
		
		else if(flagSelect == 4) {
			//ͨ��type��ѯ
			String textFieldString = textField.getText();
			if(StringUtils.isEmpty(textFieldString)!=true) {
				Fruit fruit = new Fruit();
				fruit.setType(textFieldString);;
				Fruit selectFruit = fruitService.selectFruitByTypeService(fruit);
				if(selectFruit == null ) {
					JOptionPane.showMessageDialog(null, "�Ҳ��������͵�ˮ������Ϣ");
				}else {
					fillTable(selectFruit);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "���������Ƿ�Ϸ�");
			}
			
		}
		
	}

	@Override
	protected void setSelectFruitById() {
		// TODO �Զ����ɵķ������
		flagSelect = 1;
		deleteTable();
		
	}

	@Override
	protected void setSelectFruitByName() {
		// TODO �Զ����ɵķ������
		flagSelect = 2;
		deleteTable();
	}

	@Override
	protected void setSelectFruitByPrice() {
		// TODO �Զ����ɵķ������
		flagSelect = 3;
		deleteTable();
	}

	@Override
	protected void setSelectFruitByType() {
		// TODO �Զ����ɵķ������
		flagSelect = 4;
		deleteTable();
	}

	@Override
	protected void fillTable(Fruit fruit) {
		// TODO �Զ����ɵķ������
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0); // ���ó�0��
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
		// TODO �Զ����ɵķ������
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0); // ���ó�0��
	}

	@Override
	protected void showFruit() {
		// TODO �Զ����ɵķ������
		ArrayList<Fruit> fruits = fruitService.selectAllFruitService();
		fillTable(fruits);
		
	}

	@Override
	protected void fillTable(ArrayList<Fruit> fruits) {
		// TODO �Զ����ɵķ������
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0); // ���ó�0��
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
