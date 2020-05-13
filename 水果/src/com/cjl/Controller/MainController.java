package com.cjl.Controller;

import com.cjl.view.MainJFrame;

public class MainController extends MainJFrame{

	@Override
	protected void purchase() {
		// TODO 自动生成的方法存根
		PurchaseController purchaseController = new PurchaseController();
		purchaseController.setVisible(true);
		desktopPane.add(purchaseController);
		
	}

	@Override
	protected void select() {
		// TODO 自动生成的方法存根
		SelectController selectController = new SelectController();
		selectController.setVisible(true);
		desktopPane.add(selectController);
	}

	@Override
	protected void clean() {
		// TODO 自动生成的方法存根
		CleanController cleanController = new CleanController();
		cleanController.setVisible(true);
		desktopPane.add(cleanController);
		
	}

	@Override
	protected void type() {
		// TODO 自动生成的方法存根
		TypeController typeController = new TypeController();
		typeController.setVisible(true);
		desktopPane.add(typeController);
		
	}

	@Override
	protected void update() {
		// TODO 自动生成的方法存根
		UpdateController updateController = new UpdateController();
		updateController.setVisible(true);
		desktopPane.add(updateController);
		
	}

}
