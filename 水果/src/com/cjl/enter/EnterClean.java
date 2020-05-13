package com.cjl.enter;

import java.awt.EventQueue;

import com.cjl.Controller.CleanController;

public class EnterClean {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CleanController cleanController = new CleanController();
					cleanController.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
