package com.cjl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Date;

import com.cjl.model.MemberInformation;
import com.cjl.model.PersonalInformation;
import com.cjl.model.ShopMember;

/**
 * ��ԱDao��
 * 
 * @author 24550
 *
 */
public class ShopMemberDao {
	/**
	 * ��ӻ�Ա��Ϣ
	 */
	public int add(Connection con, ShopMember member) throws Exception {
		PersonalInformation personalInformation = new PersonalInformation(member.getName(),
				member.getSex(), member.getAge(), member.getPersonId(), member.getAddress());
		
		MemberInformation memberInformation = new MemberInformation(member.getPersonId(),
				member.getIdPassword(),member.getPoints(),member.getBalance());
		
		//INSERT INTO member_information
		String sql1 = "INSERT INTO member_information VALUES (null,?,?,1,?,?,?,0)";
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		pstmt1.setString(1, memberInformation.getPersonId());
		pstmt1.setString(2, memberInformation.getIdPassword());
		pstmt1.setDouble(3, memberInformation.getPoints());
		pstmt1.setDouble(4, memberInformation.getBalance());
		pstmt1.setDouble(5, memberInformation.getBalance());
		pstmt1.executeUpdate();
		//INSERT INTO personal_information
		String sql2 = "INSERT INTO personal_information VALUES (?,?,?,?,?)";
		PreparedStatement pstmt2 = con.prepareStatement(sql2);
		pstmt2.setString(1, personalInformation.getPersonId());
		pstmt2.setString(2, personalInformation.getName());
		pstmt2.setString(3, personalInformation.getSex());
		pstmt2.setInt(4, personalInformation.getAge());
		pstmt2.setString(5, personalInformation.getAddress());
		
		return pstmt2.executeUpdate();
	}

	/**
	 * delete ��Ա
	 * 
	 * @param con
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delete(Connection con, ShopMember member) throws Exception {
		String sql1 = "DELETE personal_information "
				+ "FROM member_information INNER JOIN personal_information "
				+ "ON member_information.���֤�� = personal_information.���֤�� "
				+ "WHERE member_information.��Աid = ? "
				+ "AND member_information.��Ա���� = ? "
				+ "AND member_information.���֤�� = ?";
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		pstmt1.setInt(1, member.getId());
		pstmt1.setString(2, member.getIdPassword());
		pstmt1.setString(3, member.getPersonId());
		
		pstmt1.executeUpdate();
		
		String sql2 = "DELETE member_information "
				+ "FROM member_information "
				+ "WHERE member_information.��Աid = ? "
				+ "and member_information.���֤�� = ? "
				+ "and member_information.��Ա���� = ?";
		PreparedStatement pstmt2 = con.prepareStatement(sql2);
		pstmt2.setInt(1, member.getId());
		pstmt2.setString(2, member.getPersonId());
		pstmt2.setString(3, member.getIdPassword());
		//pstmt2.executeUpdate();
		
		
		
		return pstmt2.executeUpdate();
	}

	/**
	 * vip list ��Ա�б�
	 * 
	 * @param con
	 * @param shopMember
	 * @return
	 * @throws Exception
	 */
	public ResultSet memberList(Connection con, ShopMember shopMember) throws Exception {
		StringBuffer sb = new StringBuffer("select * from member_information");
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		return pstmt.executeQuery();
	}
	public ResultSet personalList(Connection con, ShopMember shopMember) throws Exception {
		StringBuffer sb = new StringBuffer("select * from personal_information");
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		return pstmt.executeQuery();
	}
	public ResultSet personalRecord(Connection con, ShopMember shopMember) throws Exception {
		StringBuffer sb = new StringBuffer("select * from personal_record");
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		return pstmt.executeQuery();
	}
	/**
	 * �޸�ʱ�����֤
	 * @param con
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public ShopMember loginId(Connection con,ShopMember shopMember)throws Exception{
		ShopMember resultUser=null;
		String sql="select * from member_information where ��Աid =? and ��Ա���� =?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, shopMember.getId());
		pstmt.setString(2, shopMember.getIdPassword());
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			resultUser=new ShopMember();
			resultUser.setId(rs.getInt("��Աid"));
			resultUser.setIdPassword(rs.getString("��Ա����"));
			//resultUser.setPassword(rs.getString("password"));
		}
		return resultUser;
	}
	/**
	 * ��֤���֤�ź�
	 * 
	 * 
	 */
	public ShopMember loginPhone(Connection con,MemberInformation member)throws Exception{
		ShopMember resultUser=null;
		String sql="select * from member_information where ��Աid =? and ���֤��=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, member.getId());
		pstmt.setString(2, member.getPersonId());
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			resultUser=new ShopMember();
			resultUser.setId(rs.getInt("��Աid"));
			resultUser.setIdPassword(rs.getString("���֤��"));
			//resultUser.setPassword(rs.getString("password"));
		}
		return resultUser;
	}
	/**
	 * �޸ĸ�����Ϣ���
	 */
	public int updatePerson(Connection con, PersonalInformation person,MemberInformation member) throws Exception {
		String sql1 = "UPDATE personal_information a INNER JOIN member_information b " + 
				"ON a.`���֤��` = b.`���֤��` " + 
				"SET a.`����` = ? , a.`�Ա�` = ? , a.`����` = ? , a.`��ַ` = ? " + 
				"WHERE b.`��Աid` = ? AND b.`��Ա����` = ?";
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		//pstmt1.setString(1, person.getPhone());
		pstmt1.setString(1, person.getName());
		pstmt1.setString(2, person.getSex());
		pstmt1.setInt(3, person.getAge());
		pstmt1.setString(4, person.getAddress());
		pstmt1.setInt(5, member.getId());
		pstmt1.setString(6, member.getIdPassword());
		//pstmt1.executeUpdate();
				
		
		return pstmt1.executeUpdate();
	}
	/**
	 *�޸��������
	 *
	 */
	public int updatePassword(Connection con,MemberInformation member) throws Exception {
		String sql1 = "UPDATE member_information "
				+ "SET member_information.`��Ա����` = ? "
				+ "WHERE member_information.`��Աid` = ? AND member_information.`���֤��` = ?";
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		pstmt1.setString(1, member.getIdPassword());
		pstmt1.setInt(2, member.getId());
		pstmt1.setString(3, member.getPersonId());
		//pstmt1.executeUpdate();
				
		
		return pstmt1.executeUpdate();
	}
	public int updatePhone(Connection con,MemberInformation member) throws Exception {
		String sql1 = "UPDATE personal_phone "
				+ "SET personal_phone.`�ֻ�1` = ? "
				+ "WHERE personal_phone.`��Աid` = ?";
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		pstmt1.setString(1, member.getIdPassword());
		pstmt1.setInt(2, member.getId());
		//pstmt1.executeUpdate();
				
		
		return pstmt1.executeUpdate();
	}
	/**
	 * �޸ĵȼ����
	 */
	public int updateLevel(Connection con,MemberInformation member) throws Exception {
		String sql1 = "UPDATE member_information "
				+ "SET member_information.`��Ա����` = member_information.`��Ա����` + ? "
				+ "WHERE member_information.`��Աid` = ? AND member_information.`��Ա����` = ?";
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		pstmt1.setInt(1, member.getLevel());
		pstmt1.setInt(2, member.getId());
		pstmt1.setString(3, member.getIdPassword());
		pstmt1.executeUpdate();
		String sql2 = "UPDATE member_information " + 
				"SET member_information.`�������` = member_information.`�������` -20*? " + 
				"WHERE member_information.`��Աid` = ? AND member_information.`��Ա����` = ?";
		PreparedStatement pstmt2 = con.prepareStatement(sql2);
		pstmt2.setInt(1, member.getLevel());
		pstmt2.setInt(2, member.getId());
		pstmt2.setString(3, member.getIdPassword());
		
				
		
		return pstmt2.executeUpdate();
	}
	/**
	 * �޸Ļ���
	 */
	public int updatePoints(Connection con,MemberInformation member) throws Exception {
		String sql1 = "UPDATE member_information "
				+ "SET member_information.`�������` = member_information.`�������` - ? "
				+ "WHERE member_information.`��Աid` = ? AND member_information.`��Ա����` = ?";
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		pstmt1.setDouble(1, member.getPoints());
		pstmt1.setInt(2, member.getId());
		pstmt1.setString(3, member.getIdPassword());
	
		
				
		
		return pstmt1.executeUpdate();
	}
	/**
	 * �޸��������
	 * 
	 */
	public int updateBalance(Connection con,MemberInformation member) throws Exception {
		String sql1 = "UPDATE member_information "
				+ "SET member_information.`�������` = member_information.`�������` + ? "
				+ "WHERE member_information.`��Աid` = ? AND member_information.`��Ա����` = ?";
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		pstmt1.setDouble(1, member.getBalance());
		pstmt1.setInt(2, member.getId());
		pstmt1.setString(3, member.getIdPassword());
		pstmt1.executeUpdate();
		
		String sql2 = "UPDATE member_information "
				+ "SET member_information.`�ܳ�ֵ���` = member_information.`�ܳ�ֵ���` + ? "
				+ "WHERE member_information.`��Աid` = ? AND member_information.`��Ա����` = ?";
		PreparedStatement pstmt2 = con.prepareStatement(sql2);
		//System.out.println(member.getBalance());
		pstmt2.setDouble(1, member.getBalance());
		pstmt2.setInt(2, member.getId());
		pstmt2.setString(3, member.getIdPassword());
		pstmt2.executeUpdate();
		
		String sql3 = "UPDATE member_information "
				+ "SET member_information.`�������` = member_information.`�������` + ? "
				+ "WHERE member_information.`��Աid` = ? AND member_information.`��Ա����` = ?";
		PreparedStatement pstmt3 = con.prepareStatement(sql3);
		//System.out.println(member.getBalance());
		double a = 5*(member.getBalance() / 100);
		System.out.println(a);
		pstmt3.setDouble(1, a);
		pstmt3.setInt(2, member.getId());
		pstmt3.setString(3, member.getIdPassword());
		pstmt3.executeUpdate();
		//Date date = new Date();
		String sql4 = "INSERT INTO personal_record (`��Աid`,`��ֵ���`,`��ֵʱ��`) VALUES (?,?,?)";
		PreparedStatement pstmt4 = con.prepareStatement(sql4);
		pstmt4.setInt(1, member.getId());
		pstmt4.setDouble(2, member.getBalance());
		pstmt4.setDate(3, new java.sql.Date(new Date().getTime()));
		
		
				
		
		return pstmt4.executeUpdate();
	}
}
