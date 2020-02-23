package com.cjl.util;
/**
 * �ַ���������
 * @author 24550
 *
 */
public class StringUtil {
	/**
	 * �ж��Ƿ�Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if(str==null || "".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * �ж��Ƿ��ǿ�
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if(str!=null && !"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * �Ա��ж�
	 */
	public static boolean isSex(String sex) {
		if(sex.equals("��") || sex.equals("Ů"))
			return true;
		else
			return false;
	}
	public static boolean isPhone(String phone) {
		if(phone.length() == 11)
			return true;
		else
			return false;
	}
	public static boolean isAge(int age) {
		if(age > 0)
			return true;
		else
			return false;
	}
	public static boolean isPassword(String password) {
		if(password.length() >6 && password.length() < 16)
			return true;
		else
			return false;
	}
	
}
