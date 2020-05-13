package com.cjl.enter;

import java.awt.EventQueue;

import com.cjl.Controller.SelectController;
import com.cjl.view.SelectJInternalFrame;

public class EnterSelect {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectController selectController = new SelectController();
					selectController.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
