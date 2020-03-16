package com.cjl.�����ļ�;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchFileThread extends Thread {
	private File file;
	private String search;

	public SearchFileThread(File file, String search) {
		super();
		this.file = file;
		this.search = search;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		String fileCountent = readFileConent(file);
		if(fileCountent.contains(search))
			System.out.println("�ҵ���" + search + "��" + file.getAbsolutePath());
	}

	public String readFileConent(File file){
        try (FileReader fr = new FileReader(file)) {
            char[] all = new char[(int) file.length()];
            fr.read(all);
            //System.out.println(all.length() + " " + file.length());
            return new String(all);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
  
    }  

	public static void main(String[] args) {

	}
}
