package com.cjl.Controller;

import javax.swing.JOptionPane;

import com.cjl.Bean.Fruit;
import com.cjl.Service.FruitService;
import com.cjl.view.PurchaseJInternalFrame;

public class PurchaseController extends PurchaseJInternalFrame{
	
	FruitService fruitService = new FruitService();

	@Override
	protected void setEmpty() {
		// TODO 自动生成的方法存根
		idText.setText("");
		nameText.setText("");
		priceText.setText("");
		unitText.setText("");
		quantinyText.setText("");
		typeText.setText("");
		
	}

	@Override
	protected void insertFruit() {
		// TODO 自动生成的方法存根
		Fruit insertFruit = new Fruit();
		
		String idString = idText.getText();
		String nameString = nameText.getText();
		String priceString = priceText.getText();
		String unitString = unitText.getText();
		String quantinyString = quantinyText.getText();
		String typeString = typeText.getText();
		Integer id = Integer.valueOf(idString);
		Double price = Double.valueOf(priceString);
		Integer quantiny = Integer.valueOf(quantinyString);
		
		insertFruit.setId(id);
		insertFruit.setName(nameString);
		insertFruit.setPrice(price);
		insertFruit.setUnit(unitString);
		insertFruit.setQuantiny(quantiny);
		insertFruit.setType(typeString);
		
		int rows = fruitService.insertFruitByFruitService(insertFruit);
		if(rows>0) {
			JOptionPane.showMessageDialog(null, "录入成功");
		}else {
			JOptionPane.showMessageDialog(null, "该水果ID重复，请详细检查，若为增加库存，请到修改信息窗口。");
		}
		
	}

}
