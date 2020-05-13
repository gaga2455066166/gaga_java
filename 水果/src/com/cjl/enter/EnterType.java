package com.cjl.enter;

import java.awt.EventQueue;

import com.cjl.Controller.TypeController;

public class EnterType {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TypeController typeController = new TypeController();
					typeController.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
