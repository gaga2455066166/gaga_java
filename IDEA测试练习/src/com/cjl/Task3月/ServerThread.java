package com.cjl.Task3月;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {

    private Socket s;
    public ServerThread(Socket s){
        this.s = s;
    }

    @Override
    public void run() {
        try {
            InputStream is;
            is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedReader bfr = new BufferedReader(new InputStreamReader(is));
            //PrintStream ps = new PrintStream(os);
            System.out.println("从客户端：" + bfr.readLine());
            //ps.println("已接收链接。");
            os.write("已接收链接。".getBytes());
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
