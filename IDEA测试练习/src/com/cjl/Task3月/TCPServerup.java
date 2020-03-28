package com.cjl.Task3月;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerup {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("监听在端口号:8888");
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            FileOutputStream fileOut = new FileOutputStream("TestTcp\\" + s.getInetAddress() + "txt");
            byte[] buf = new byte[1024];
            int len;
            while ((len = is.read(buf)) != -1) {
                fileOut.write(buf, 0, len);
            }
            s.shutdownInput();
            os.write("服务器已接收。".getBytes());
            fileOut.close();
            s.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}