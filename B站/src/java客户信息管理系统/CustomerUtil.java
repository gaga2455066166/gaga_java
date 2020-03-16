package java�ͻ���Ϣ����ϵͳ;

/**
 * ������
 * @author 24550
 *
 */
import java.util.*;

import com.sun.javafx.image.IntToBytePixelConverter;

public class CustomerUtil {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * ѡ��˵�
	 * 
	 * @return
	 */
	public static char readMenuSelection() {
		char c;
		for (;;) {
			String str = readKeyBoard(1, false);
			c = str.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
				System.out.println("ѡ�����������ѡ��");
			} else {
				break;
			}
		}
		return c;

	}
	/**
	 * �Ӽ��̶�ȡһ���ַ�
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
				System.out.println("�����������");
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
				System.out.println("�����������");
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
				System.out.println("���������������");
				
			}
		}
		return c;
	}
	
	
	
	
	
	private static String readKeyBoard(int limit, boolean blankReturn) {
		// TODO �Զ����ɵķ������
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
				System.out.println("����ĳ��ȴ���");
				continue;
			}
			break;
			
		}
		return line;
	}
}
