package 作业0307;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	/**
	 * 实现功能：从文件中获取信息，并保存在List中
	 * 
	 * @param pathname
	 * @return
	 * @throws IOException
	 */
	public static List<String> getListFromFile(String pathname) throws IOException {
		FileInputStream in = new FileInputStream(pathname);
		List<String> list = new ArrayList<String>();
		String str;
		BufferedReader buff = new BufferedReader(new InputStreamReader(in));
		while ((str = buff.readLine()) != null) {
			list.add(str);
		}
		buff.close();
		in.close();
		return list;
	}

	/**
	 * 实现功能：将信息写到文件中。
	 * 
	 * @param list
	 * @param pathname
	 * @param append
	 * @return
	 * @throws IOException
	 */
	private static boolean saveListToFile(List<String> list, String pathname, boolean append) throws IOException {
		OutputStream outputStream = new FileOutputStream(pathname, append);
		for (String string : list) {
			outputStream.write(string.getBytes());
			outputStream.close();
		}
		return true;
	}

	/**
	 * 实现功能：将信息写到文件中(覆盖)
	 * 
	 * @param list
	 * @param pathname
	 * @return
	 * @throws IOException
	 */
	public static boolean saveListToFile(List<String> list, String pathname) throws IOException {
		return saveListToFile(list, pathname, false);
	}

	/**
	 * 实现功能：将信息追加到文件中(追加)
	 * 
	 * @param message
	 * @param pathname
	 * @return
	 * @throws IOException
	 */
	public static boolean appendListToFile(String message, String pathname) throws IOException {
		List<String> list = new ArrayList<String>();
		list.add(message);
		return saveListToFile(list, pathname, true);

	}
}
