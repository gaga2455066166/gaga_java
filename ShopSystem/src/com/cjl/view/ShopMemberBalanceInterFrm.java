package com.cjl.view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JInternalFrame;

import com.cjl.dao.ShopMemberDao;
import com.cjl.model.ShopMember;
import com.cjl.util.DbUtil;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ShopMemberBalanceInterFrm extends JInternalFrame {

	private DbUtil dbUtil = new DbUtil();
	private ShopMemberDao shopMemberDao = new ShopMemberDao();
	private JTable memberBalanceTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMemberBalanceInterFrm frame = new ShopMemberBalanceInterFrm();
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
	public ShopMemberBalanceInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE));

		memberBalanceTable = new JTable();
		memberBalanceTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID",
				"\u6D88\u8D39\u4F59\u989D", "\u603B\u5145\u503C\u91D1\u989D", "\u603B\u8D2D\u7269\u6B21\u6570" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		memberBalanceTable.getColumnModel().getColumn(0).setPreferredWidth(68);
		memberBalanceTable.getColumnModel().getColumn(1).setPreferredWidth(94);
		memberBalanceTable.getColumnModel().getColumn(2).setPreferredWidth(92);
		scrollPane.setViewportView(memberBalanceTable);
		getContentPane().setLayout(groupLayout);

		this.fillTable(new ShopMember());
	}

	/**
	 * 填充表格
	 * 
	 * @param bookType
	 */
	private void fillTable(ShopMember shopMember) {
		DefaultTableModel dtm = (DefaultTableModel) memberBalanceTable.getModel();
		dtm.setRowCount(0); // 设置成0行
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ResultSet rs = shopMemberDao.memberList(con, shopMember);
			while (rs.next()) {
				Vector v = new Vector();
				v.add(rs.getString("会员id"));
				v.add(rs.getString("消费余额"));
				v.add(rs.getString("总充值金额"));
				v.add(rs.getString("总购物次数"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
