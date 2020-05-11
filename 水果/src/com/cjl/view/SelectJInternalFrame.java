package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class SelectJInternalFrame extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectJInternalFrame frame = new SelectJInternalFrame();
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
	public SelectJInternalFrame() {
		setBounds(100, 100, 450, 300);

	}

}
