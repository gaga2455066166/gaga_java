package com.cjl.util;
/**
 * 字符串工具类
 * @author 24550
 *
 */
public class StringUtil {
	/**
	 * 判断是否为空
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
	 * 判断是否不是空
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
	 * 性别判定
	 */
	public static boolean isSex(String sex) {
		if(sex.equals("男") || sex.equals("女"))
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
