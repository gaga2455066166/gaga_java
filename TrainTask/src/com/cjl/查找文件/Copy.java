package com.cjl.查找文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Copy {

	/**
	 * 
	 * @param srcFile
	 * @param destFile
	 */
	public static void copyFile(String srcPath, String destPath) {
		File srcFile = new File(srcPath);
		File destFile = new File(destPath);
		byte[] buffer = new byte[1024];
		try (FileInputStream fileInputStream = new FileInputStream(srcFile);
				FileOutputStream fileOutputStream = new FileOutputStream(destFile);) {
			while (true) {
				// 实际读取的长度是 actuallyReaded,有可能小于1024
				int actuallyReaded = fileInputStream.read(buffer);
				// -1表示没有可读的内容了
				if (-1 == actuallyReaded)
					break;
				fileOutputStream.write(buffer, 0, actuallyReaded);
				fileOutputStream.flush();
			}

		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	/**
	 * copy文件夹
	 * 
	 * @param srcPath
	 * @param destPath
	 */
	public static void copyFolder(String srcPath, String destPath) {
		File srcFolder = new File(srcPath);
		File destFolder = new File(destPath);
		if (!srcFolder.exists()) {
			System.out.println("源路径不存在！");
			return;
		}

		if (!srcFolder.isDirectory()) {
			System.out.println("源路径不是文件夹！");
			return;
		}
		if (!destFolder.exists()) {
			System.out.println("目标路径不存在！");
			return;
		}

		if (!destFolder.isDirectory()) {
			System.out.println("目标路径不是文件夹！");
			return;
		}
		File[] files = srcFolder.listFiles();
		for (File file0 : files) {
			if (file0.isFile()) {
				File newFile = new File(destFolder, file0.getName());
				copyFile(file0.getAbsolutePath(), newFile.getAbsolutePath());
			}
			if (file0.isDirectory()) {
				File newDestFolder = new File(destFolder, file0.getName());
				copyFolder(file0.getAbsolutePath(), newDestFolder.getAbsolutePath());
			}
		}

	}

	/**
	 * 查找文件内容
	 * 
	 * @param folder
	 * @param search
	 */
	public static void search(File file, String search) {
		if (file.isFile()) {
			if (file.getName().toLowerCase().endsWith(".txt")) {
				String fileContent = readFileConent(file);
				if (fileContent.contains(search)) {
					System.out.printf("找到子目标字符串%s,在文件:%s%n", search, file);
				}
				else
					System.out.println("没找到");
			}
		}
		if (file.isDirectory()) {
			File[] fs = file.listFiles();
			for (File f : fs) {
				search(f, search);
			}
		}
	}

	/**
	 * 读取文件
	 * 
	 * @param file
	 * @return
	 */
	public static String readFileConent(File file) {
		try (FileReader fr = new FileReader(file)) {
			char[] all = new char[(int) file.length()];
			fr.read(all);
			return new String(all);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

	public static void main(String[] args) {
//		copyFile("T20200306_out.txt", "temp//233.txt");
//		copyFolder("temp", "temp0");
		File folder = new File("T20200306_out.txt");
		search(folder, "00");
	}
}
