package com.cjl.�����ļ�;

import java.io.File;

public class TestThread {
	public static void search(File file, String search) {
        if (file.isFile()) {
            if(file.getName().toLowerCase().endsWith(".txt")){
                //���ҵ�.java�ļ���ʱ�򣬾�����һ���̣߳�����ר�ŵĲ���
                new SearchFileThread(file,search).start();
            }
        }
        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            for (File f : fs) {
                search(f, search);
            }
        }
    }
      
    public static void main(String[] args) {
        File folder =new File(".");
        search(folder,"00");
    }
}
