package com.cjl.Controller;

import com.cjl.view.MainJFrame;

public class MainController extends MainJFrame{

	@Override
	protected void purchase() {
		// TODO �Զ����ɵķ������
		PurchaseController purchaseController = new PurchaseController();
		purchaseController.setVisible(true);
		desktopPane.add(purchaseController);
		
	}

	@Override
	protected void select() {
		// TODO �Զ����ɵķ������
		SelectController selectController = new SelectController();
		selectController.setVisible(true);
		desktopPane.add(selectController);
	}

	@Override
	protected void clean() {
		// TODO �Զ����ɵķ������
		CleanController cleanController = new CleanController();
		cleanController.setVisible(true);
		desktopPane.add(cleanController);
		
	}

	@Override
	protected void type() {
		// TODO �Զ����ɵķ������
		TypeController typeController = new TypeController();
		typeController.setVisible(true);
		desktopPane.add(typeController);
		
	}

	@Override
	protected void update() {
		// TODO �Զ����ɵķ������
		UpdateController updateController = new UpdateController();
		updateController.setVisible(true);
		desktopPane.add(updateController);
		
	}

}
