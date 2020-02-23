package com.cjl.view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.cjl.dao.ShopMemberDao;
import com.cjl.model.ShopMember;
import com.cjl.util.DbUtil;

public class ShopMemberListInterFrm extends JInternalFrame {
	private JTable memberListTable;
	
	
	private DbUtil dbUtil=new DbUtil();
	private ShopMemberDao shopMemberDao = new ShopMemberDao();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMemberListInterFrm frame = new ShopMemberListInterFrm();
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
	public ShopMemberListInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
		);
		
		memberListTable = new JTable();
		memberListTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"I D", "\u8EAB\u4EFD\u8BC1\u53F7", "\u4F1A\u5458\u7EA7\u522B"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(memberListTable);
		getContentPane().setLayout(groupLayout);
		this.fillTable( new ShopMember());
	}
	
	/**
	 *  填充表格
	 * @param bookType
	 */
	private void fillTable(ShopMember shopMember){
		DefaultTableModel dtm=(DefaultTableModel) memberListTable.getModel();
		dtm.setRowCount(0); // 设置成0行
		Connection con=null;
		try{
			con=dbUtil.getCon();
			ResultSet rs=shopMemberDao.memberList(con, shopMember);
			while(rs.next()){
				Vector v=new Vector();
				v.add(rs.getString("会员id"));
				v.add(rs.getString("身份证号"));
				v.add(rs.getString("会员级别"));
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
