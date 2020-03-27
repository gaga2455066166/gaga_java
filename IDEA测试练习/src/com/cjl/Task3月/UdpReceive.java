package com.cjl.Task3月;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceive {
    public static void main(String[] args) throws IOException {
        System.out.println("---------接收端---------");
        // 1、创建socket服务
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        while (true) {
            byte[] b = new byte[1024];
            // 2、创建数据包用于存储接收到的数据
            DatagramPacket dp = new DatagramPacket(b, b.length);
            // 3、将接收的数据存入数据包
            datagramSocket.receive(dp);
            // 4、解析数据包中的数据
            String ip = dp.getAddress().getHostAddress();
            int port = dp.getPort();
            String str = new String(dp.getData(), 0, dp.getLength());
            System.out.println(ip + ":" + port + "== " + str);
        }
    }
}
