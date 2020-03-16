package ��ҵ0307;

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
	 * ʵ�ֹ��ܣ����ļ��л�ȡ��Ϣ����������List��
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
	 * ʵ�ֹ��ܣ�����Ϣд���ļ��С�
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
	 * ʵ�ֹ��ܣ�����Ϣд���ļ���(����)
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
	 * ʵ�ֹ��ܣ�����Ϣ׷�ӵ��ļ���(׷��)
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
