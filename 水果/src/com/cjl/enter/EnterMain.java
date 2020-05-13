package com.cjl.enter;

import java.awt.EventQueue;

import com.cjl.Controller.MainController;

public class EnterMain {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainController mainController = new MainController();
					mainController.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
