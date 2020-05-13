package com.cjl.Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.cjl.Bean.Fruit;
import com.cjl.Service.FruitService;
import com.cjl.Tool.StringUtils;
import com.cjl.view.TypeJInternalFrame;

public class TypeController extends TypeJInternalFrame{
	FruitService fruitService = new FruitService();

	@Override
	protected void showFruit() {
		// TODO �Զ����ɵķ������
		ArrayList<Fruit> fruits = fruitService.selectAllFruitService();
		fillTable(fruits);
		
	}

	@Override
	protected void updateType() {
		// TODO �Զ����ɵķ������
		String oldTypeString = oldType.getText();
		String newTypeString = newType.getText();
		if(isOldEmpty() == true || isNewEmpty() == true) {
			JOptionPane.showMessageDialog(null, "�Ƿ����룬��������޸ġ�");
		}else {
			Fruit oldFruit = new Fruit();
			Fruit newFruit = new Fruit();
			oldFruit.setType(oldTypeString);
			newFruit.setType(newTypeString);
			int rows = fruitService.updateFruitByTypeService(oldFruit, newFruit);
			if(rows>0) {
				JOptionPane.showMessageDialog(null, "�޸ĳɹ���" + rows + "�����ݱ��޸ġ�");
				showFruit();
			}
			else {
				JOptionPane.showMessageDialog(null, "�޸�ʧ�ܡ�");
			}
		}
		
		
	}

	@Override
	protected void deleteType() {
		// TODO �Զ����ɵķ������
		String oldTypeString = oldType.getText();
		if(isOldEmpty() == true) {
			JOptionPane.showMessageDialog(null, "�Ƿ����룬��������޸ġ�");
		}else {
			Fruit fruit = new Fruit();
			fruit.setType(oldTypeString);
			int rows = fruitService.deleteFruitByTypeService(fruit);
			if(rows>0) {
				JOptionPane.showMessageDialog(null, "ɾ���ɹ���" + rows + "�����ݱ�ɾ����");
				showFruit();
			}
			else {
				JOptionPane.showMessageDialog(null, "ɾ��ʧ�ܡ�");
			}
		}
	}

	@Override
	protected void fillTable(ArrayList<Fruit> fruits) {
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0); // ���ó�0��
		boolean flag = false;
		Iterator fruitIterator = fruits.iterator();
		while (fruitIterator.hasNext()) {
			flag = true;
			Vector v=new Vector();
			Fruit fruit = (Fruit) fruitIterator.next();
			v.add(fruit.getType());
			v.add(fruit.getName());
			v.add(fruit.getId());
			
			dtm.addRow(v);
			
		}
		
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected boolean isOldEmpty() {
		// TODO �Զ����ɵķ������
		String oldTypeString = oldType.getText();
		if(StringUtils.isEmpty(oldTypeString) == true) {
			return true;
		}
		return false;
	}

	@Override
	protected boolean isNewEmpty() {
		// TODO �Զ����ɵķ������
		String newTypeString = newType.getText();
		if(StringUtils.isEmpty(newTypeString) == true) {
			return true;
		}
		return false;
		
	}

}
