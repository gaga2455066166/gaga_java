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
		// TODO 自动生成的方法存根
		ArrayList<Fruit> fruits = fruitService.selectAllFruitService();
		fillTable(fruits);
		
	}

	@Override
	protected void updateType() {
		// TODO 自动生成的方法存根
		String oldTypeString = oldType.getText();
		String newTypeString = newType.getText();
		if(isOldEmpty() == true || isNewEmpty() == true) {
			JOptionPane.showMessageDialog(null, "非法输入，请检查后再修改。");
		}else {
			Fruit oldFruit = new Fruit();
			Fruit newFruit = new Fruit();
			oldFruit.setType(oldTypeString);
			newFruit.setType(newTypeString);
			int rows = fruitService.updateFruitByTypeService(oldFruit, newFruit);
			if(rows>0) {
				JOptionPane.showMessageDialog(null, "修改成功，" + rows + "条数据被修改。");
				showFruit();
			}
			else {
				JOptionPane.showMessageDialog(null, "修改失败。");
			}
		}
		
		
	}

	@Override
	protected void deleteType() {
		// TODO 自动生成的方法存根
		String oldTypeString = oldType.getText();
		if(isOldEmpty() == true) {
			JOptionPane.showMessageDialog(null, "非法输入，请检查后再修改。");
		}else {
			Fruit fruit = new Fruit();
			fruit.setType(oldTypeString);
			int rows = fruitService.deleteFruitByTypeService(fruit);
			if(rows>0) {
				JOptionPane.showMessageDialog(null, "删除成功，" + rows + "条数据被删除。");
				showFruit();
			}
			else {
				JOptionPane.showMessageDialog(null, "删除失败。");
			}
		}
	}

	@Override
	protected void fillTable(ArrayList<Fruit> fruits) {
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0); // 设置成0行
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
		
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected boolean isOldEmpty() {
		// TODO 自动生成的方法存根
		String oldTypeString = oldType.getText();
		if(StringUtils.isEmpty(oldTypeString) == true) {
			return true;
		}
		return false;
	}

	@Override
	protected boolean isNewEmpty() {
		// TODO 自动生成的方法存根
		String newTypeString = newType.getText();
		if(StringUtils.isEmpty(newTypeString) == true) {
			return true;
		}
		return false;
		
	}

}
