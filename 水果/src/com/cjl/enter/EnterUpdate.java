package com.cjl.enter;

import java.awt.EventQueue;

import com.cjl.Controller.UpdateController;
import com.cjl.view.UpdateJInternalFrame;

public class EnterUpdate {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateController updateController = new UpdateController();
					updateController.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
