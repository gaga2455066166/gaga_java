package java客户信息管理系统;

/**
 * 工具类
 * @author 24550
 *
 */
import java.util.*;

import com.sun.javafx.image.IntToBytePixelConverter;

public class CustomerUtil {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * 选择菜单
	 * 
	 * @return
	 */
	public static char readMenuSelection() {
		char c;
		for (;;) {
			String str = readKeyBoard(1, false);
			c = str.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
				System.out.println("选择错误，请重新选择！");
			} else {
				break;
			}
		}
		return c;

	}
	/**
	 * 从键盘读取一个字符
	 * @return
	 */
	public static char readChar() {
		String str = readKeyBoard(1, false);
		return str.charAt(0);

	}
	
	public static char readChar(char defaultValue) {
		String str = readKeyBoard(1, false);
		return (str.length() == 0 ) ? defaultValue : str.charAt(0);

	}

	public static int readInt() {
		int n;
		for(;;) {
			String str = readKeyBoard(2, false);
			try {
				n = Integer.parseInt(str);
				break;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("数字输入错误！");
			}
		}
		return n;
	}
	
	public static int readInt(int defaultValue) {
		int n;
		for(;;) {
			String str = readKeyBoard(2, true);
			if(str.equals(""))
				return defaultValue;
			
			try {
			 	n = Integer.parseInt(str);
				break;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("数字输入错误！");
			}
		}
		return n;
	}
	
	public static String readString(int limit) {
		return readKeyBoard(limit, false);
		
	}
	
	public static String readString(int limit,String defaultValue) {
		
		String str = readKeyBoard(limit, true);
		return str.equals("") ? defaultValue : str;
		
	}
	
	public static char readConfirmSelection() {
		char c;
		for(;;) {
			String str = readKeyBoard(1, false).toUpperCase();
			c = str.charAt(0);
			if(c == 'y' || c== 'Y' || c=='n' || c == 'N')
				break;
			else {
				System.out.println("输入错误，重新输入");
				
			}
		}
		return c;
	}
	
	
	
	
	
	private static String readKeyBoard(int limit, boolean blankReturn) {
		// TODO 自动生成的方法存根
		String line ="";
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			if(line.length() == 0) {
				if(blankReturn)
					return line;
				else
					continue;
			}
			if(line.length()<1 || line.length()>limit) {
				System.out.println("输入的长度错误");
				continue;
			}
			break;
			
		}
		return line;
	}
}
