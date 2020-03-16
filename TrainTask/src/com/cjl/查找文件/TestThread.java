package com.cjl.查找文件;

import java.io.File;

public class TestThread {
	public static void search(File file, String search) {
        if (file.isFile()) {
            if(file.getName().toLowerCase().endsWith(".txt")){
                //当找到.java文件的时候，就启动一个线程，进行专门的查找
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
