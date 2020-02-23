package com.cjl.view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.cjl.dao.ShopMemberDao;
import com.cjl.model.ShopMember;
import com.cjl.util.DbUtil;

public class ShopMemberPersonInterFrm extends JInternalFrame {
	private JTable memberPersonTable;

	private DbUtil dbUtil = new DbUtil();
	private ShopMemberDao shopMemberDao = new ShopMemberDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMemberPersonInterFrm frame = new ShopMemberPersonInterFrm();
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
	public ShopMemberPersonInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE));

		memberPersonTable = new JTable();
		memberPersonTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8EAB\u4EFD\u8BC1\u53F7\u7801", "\u59D3\u540D", "\u6027\u522B", "\u5E74\u9F84", "\u8054\u7CFB\u5730\u5740"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		memberPersonTable.getColumnModel().getColumn(0).setPreferredWidth(215);
		memberPersonTable.getColumnModel().getColumn(2).setPreferredWidth(62);
		memberPersonTable.getColumnModel().getColumn(3).setPreferredWidth(48);
		memberPersonTable.getColumnModel().getColumn(4).setPreferredWidth(108);
		scrollPane.setViewportView(memberPersonTable);
		getContentPane().setLayout(groupLayout);
		this.fillTable(new ShopMember());
	}
	
	private void fillTable(ShopMember shopMember){
		DefaultTableModel dtm=(DefaultTableModel) memberPersonTable.getModel();
		dtm.setRowCount(0); // 设置成0行
		Connection con=null;
		try{
			con=dbUtil.getCon();
			ResultSet rs=shopMemberDao.personalList(con, shopMember);
			while(rs.next()){
				Vector v=new Vector();
				v.add(rs.getString("身份证号"));
				v.add(rs.getString("姓名"));
				v.add(rs.getString("性别"));
				v.add(rs.getString("年龄"));
				v.add(rs.getString("地址"));
				dtm.addRow(v);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
