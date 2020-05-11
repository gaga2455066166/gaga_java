package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class PurchaseJInternalFrame extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseJInternalFrame frame = new PurchaseJInternalFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PurchaseJInternalFrame() {
		setBounds(100, 100, 450, 300);

	}

}
