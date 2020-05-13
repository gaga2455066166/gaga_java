package com.cjl.Tool;

public class StringUtils {

	/**
	 * ÅÐ¶ÏÊÇ·ñÎª¿Õ
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (str == null || "".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isInteger(String str) {
		try {
			Integer.valueOf(str);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static boolean isDouble(String str) {
		try {
			Double.valueOf(str);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
