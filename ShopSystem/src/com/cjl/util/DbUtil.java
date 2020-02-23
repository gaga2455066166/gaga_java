package com.cjl.util;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * ���ݿ⹤����
 * @author 24550
 *
 */
public class DbUtil {

	private String dbUrl="jdbc:mysql://localhost:3306/db_shop?serverTimezone=UTC&characterEncoding=utf-8"; // ���ݿ����ӵ�ַ
	private String dbUserName="root"; // �û���
	private String dbPassword="94232566"; // ����
	private String jdbcName="com.mysql.cj.jdbc.Driver"; // ��������
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public Connection getCon()throws Exception{
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	
	/**
	 * �ر����ݿ�����
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("���ݿ����ӳɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
	}
	
}
