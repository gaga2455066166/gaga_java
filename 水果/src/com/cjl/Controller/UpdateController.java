package com.cjl.Controller;

import javax.swing.JOptionPane;

import com.cjl.Bean.Fruit;
import com.cjl.Service.FruitService;
import com.cjl.Tool.StringUtils;
import com.cjl.view.UpdateJInternalFrame;

public class UpdateController extends UpdateJInternalFrame{
	FruitService fruitService = new FruitService();

	@Override
	protected void selectFruit() {
		// TODO 自动生成的方法存根
		String textFieldString = textField.getText();
		Integer id = Integer.valueOf(textFieldString);
		Fruit fruit = new Fruit();
		fruit.setId(id);
		Fruit selectFruit = fruitService.selectFruitByIdService(fruit);
		if(selectFruit == null ) {
			JOptionPane.showMessageDialog(null, "找不到该ID的水果的信息");
		}
		else {
			idText.setText(selectFruit.getId().toString());
			nameText.setText(selectFruit.getName());
			priceText.setText(selectFruit.getPrice().toString());
			unitText.setText(selectFruit.getUnit());
			quantinyText.setText(selectFruit.getQuantiny().toString());
			typeText.setText(selectFruit.getType());
		}
		
	}

	@Override
	protected void updateFruit() {
		// TODO 自动生成的方法存根
		if(isEmpty() == true) {
			JOptionPane.showMessageDialog(null, "请检查完整再修改");
		}else {
			String textFieldString = textField.getText();
			Integer oldId = Integer.valueOf(textFieldString);
			Fruit fruit = new Fruit();
			fruit.setId(oldId);
			Fruit oldFruit = fruitService.selectFruitByIdService(fruit);
			
			Fruit newFruit = new Fruit();
			
			String idString = idText.getText();
			String nameString = nameText.getText();
			String priceString = priceText.getText();
			String unitString = unitText.getText();
			String quantinyString = quantinyText.getText();
			String typeString = typeText.getText();
			Integer id = Integer.valueOf(idString);
			Double price = Double.valueOf(priceString);
			Integer quantiny = Integer.valueOf(quantinyString);
			
			newFruit.setId(id);
			newFruit.setName(nameString);
			newFruit.setPrice(price);
			newFruit.setUnit(unitString);
			newFruit.setQuantiny(quantiny);
			newFruit.setType(typeString);
			
			int rows = fruitService.updateFruitByFruitService(oldFruit, newFruit);
			if(rows > 0) {
				JOptionPane.showMessageDialog(null, "修改成功");
			}else {
				JOptionPane.showMessageDialog(null, "修改失败，非法输入");
			}
		}
		
		
		
	}

	@Override
	protected boolean isEmpty() {
		// TODO 自动生成的方法存根
		String idString = idText.getText();
		String nameString = nameText.getText();
		String priceString = priceText.getText();
		String unitString = unitText.getText();
		String quantinyString = quantinyText.getText();
		String typeString = typeText.getText();
		if(StringUtils.isEmpty(idString) == true || 
				StringUtils.isEmpty(nameString) == true || 
				StringUtils.isEmpty(priceString) == true || 
				StringUtils.isEmpty(unitString) == true || 
				StringUtils.isEmpty(quantinyString) == true 
				|| StringUtils.isEmpty(typeString) == true ) {
			JOptionPane.showMessageDialog(null, "非法输入");
			return true;
		}
		
		
		
		return false;
	}
	
}
