package java�ͻ���Ϣ����ϵͳ;

/**
 * ������
 * @author 24550
 *
 */
import java.util.*;

public class CustomerUtil {
	private Scanner sc = new Scanner(System.in);

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
			if (c != 1 && c != 2 && c != 3 && c != 4 && c != 5) {
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
		return (str.length() == 0 ) ? ;

	}

	private static String readKeyBoard(int i, boolean b) {
		// TODO �Զ����ɵķ������
		return null;
	}
}
