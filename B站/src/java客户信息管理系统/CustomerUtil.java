package java客户信息管理系统;

/**
 * 工具类
 * @author 24550
 *
 */
import java.util.*;

public class CustomerUtil {
	private Scanner sc = new Scanner(System.in);

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
			if (c != 1 && c != 2 && c != 3 && c != 4 && c != 5) {
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
		return (str.length() == 0 ) ? ;

	}

	private static String readKeyBoard(int i, boolean b) {
		// TODO 自动生成的方法存根
		return null;
	}
}
