package com.cjl.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class UpdateJInternalFrame extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateJInternalFrame frame = new UpdateJInternalFrame();
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
	public UpdateJInternalFrame() {
		setBounds(100, 100, 450, 300);

	}

}
