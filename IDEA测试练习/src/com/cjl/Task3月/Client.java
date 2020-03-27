package com.cjl.Task3月;


import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {

            Socket s = new Socket("127.0.0.1", 8888);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();


            PrintStream ps = new PrintStream(os);
            ps.println("1请求接收链接");
            BufferedReader bfr = new BufferedReader(new InputStreamReader(is));
            System.out.println("从服务端：" + bfr.readLine());


            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}