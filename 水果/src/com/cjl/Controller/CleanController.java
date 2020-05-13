package com.cjl.Controller;

import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.cjl.Bean.Fruit;
import com.cjl.Service.FruitService;
import com.cjl.view.CleanJInternalFrame;

public class CleanController extends CleanJInternalFrame{
	
	FruitService fruitService =new FruitService();
	
	
	@Override
	protected void selectFruit() {
		// TODO �Զ����ɵķ������
		String textFieldString = textField.getText();
		Integer id = Integer.valueOf(textFieldString);
		Fruit fruit = new Fruit();
		fruit.setId(id);
		Fruit selectFruit = fruitService.selectFruitByIdService(fruit);
		if(selectFruit == null) {
			JOptionPane.showMessageDialog(null, "�Ҳ�����ˮ������Ϣ");
		}
		else {
			this.fillTable(selectFruit);
		}
		
		
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
	protected void deleteFruit() {
		// TODO �Զ����ɵķ������
		String textFieldString = textField.getText();
		Integer id = Integer.valueOf(textFieldString);
		Fruit fruit = new Fruit();
		fruit.setId(id);
		int rows = fruitService.deleteFruitByIdService(fruit);
		if(rows>0) {
			JOptionPane.showMessageDialog(null, "����ɹ�");
		}else {
			JOptionPane.showMessageDialog(null, "�Ҳ�����ˮ������Ϣ");
		}
		
		
	}

}
