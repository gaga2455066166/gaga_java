package com.cjl.view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.cjl.dao.ShopMemberDao;
import com.cjl.model.ShopMember;
import com.cjl.util.DbUtil;

public class ShopMemberCountInterFrm extends JInternalFrame {
	private JTable table;

	private DbUtil dbUtil=new DbUtil();
	private ShopMemberDao shopMemberDao = new ShopMemberDao();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMemberCountInterFrm frame = new ShopMemberCountInterFrm();
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
	public ShopMemberCountInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u4F1A\u5458id", "\u5145\u503C\u91D1\u989D", "\u5145\u503C\u65F6\u95F4"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(92);
		table.getColumnModel().getColumn(1).setPreferredWidth(107);
		table.getColumnModel().getColumn(2).setPreferredWidth(116);
		scrollPane.setViewportView(table);

		this.fillTable( new ShopMember());
	}
	private void fillTable(ShopMember shopMember){
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0); // 设置成0行
		Connection con=null;
		try{
			con=dbUtil.getCon();
			ResultSet rs=shopMemberDao.personalRecord(con, shopMember);
			while(rs.next()){
				Vector v=new Vector();
				v.add(rs.getString("会员id"));
				v.add(rs.getString("充值金额"));
				v.add(rs.getString("充值时间"));
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
