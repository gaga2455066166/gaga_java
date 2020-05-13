package com.cjl.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public abstract class MainJFrame extends JFrame {

	protected JPanel contentPane;
	protected JDesktopPane desktopPane;
	protected abstract void purchase();
	protected abstract void select();
	protected abstract void clean();
	protected abstract void type();
	protected abstract void update();
	



	/**
	 * Create the frame.
	 */
	public MainJFrame() {
		setTitle("\u8D85\u5E02\u6C34\u679C\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 636, 32);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u8D85\u5E02\u8D27\u7269\u7BA1\u7406");
		menuBar.add(mnNewMenu);
		
		JMenuItem item11 = new JMenuItem("\u6C34\u679C\u8FDB\u8D27");
		item11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//进货的窗口
				purchase();					
			}
		});
		mnNewMenu.add(item11);
		
		JMenuItem item12 = new JMenuItem("\u6C34\u679C\u6E05\u7406");
		item12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//水果清理
				clean();
			}
		});
		mnNewMenu.add(item12);
		
		JMenuItem item13 = new JMenuItem("\u6C34\u679C\u4FEE\u6539");
		item13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//信息修改
				update();
//				UpdateJInternalFrame updateJInternalFrame = new UpdateJInternalFrame();
//				updateJInternalFrame.setVisible(true);
//				desktopPane.add(updateJInternalFrame);
			}
		});
		mnNewMenu.add(item13);
		
		JMenuItem item14 = new JMenuItem("\u6C34\u679C\u67E5\u8BE2");
		item14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//查询的action
				select();
//				SelectJInternalFrame selectJInternalFrame= new SelectJInternalFrame();
//				selectJInternalFrame.setVisible(true);
//				desktopPane.add(selectJInternalFrame);
			}
		});
		mnNewMenu.add(item14);
		
		JMenuItem item15 = new JMenuItem("\u6C34\u679C\u7C7B\u522B");
		item15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//类别
				type();
//				TypeJInternalFrame typeJInternalFrame = new TypeJInternalFrame();
//				typeJInternalFrame.setVisible(true);
//				desktopPane.add(typeJInternalFrame);
			}
		});
		mnNewMenu.add(item15);
		
		JMenu mnNewMenu_1 = new JMenu("\u5173\u4E8E");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u7CFB\u7EDF\u5173\u4E8E");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("\u9000\u51FA\u7CFB\u7EDF");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u5B89\u5168\u9000\u51FA");
		mnNewMenu_2.add(mntmNewMenuItem);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 31, 646, 506);
		contentPane.add(desktopPane);
	}
}
