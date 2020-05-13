package com.cjl.enter;

import java.awt.EventQueue;

import com.cjl.Controller.PurchaseController;

public class EnterPurchase {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseController purchaseController = new PurchaseController();
					purchaseController.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
