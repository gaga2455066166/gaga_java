package com.cjl.Task3月;


import java.io.*;
import java.net.Socket;

public class TCPClientup {

    public static void main(String[] args) {
        try {

            Socket s = new Socket("127.0.0.1", 8888);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            FileInputStream fileIn = new FileInputStream("Test.txt");
            byte[] buf = new byte[1024];
            int len;
            while ((len = fileIn.read(buf))!=-1){
                os.write(buf,0,len);
            }
            s.shutdownOutput();
            byte[] msg = new byte[1024];
            is.read(msg);
            System.out.println("服务器：" + new String(msg));
            fileIn.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}