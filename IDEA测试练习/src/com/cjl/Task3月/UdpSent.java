package com.cjl.Task3月;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSent {
    public static void main(String[] args) throws IOException {
        System.out.println("-----发送端-------");
        // 1、建立udp的socket服务
        DatagramSocket ds = new DatagramSocket(9999);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 获取键盘录入信息
        String line = null;
        while ((line = br.readLine()) != null) {
            if ("end".equalsIgnoreCase(line)) {
                break;
            }
            byte[] b = line.getBytes();
            // 2、将要发送的数据封装到数据包中
            DatagramPacket dp = new DatagramPacket(b, b.length,
                    InetAddress.getByName("127.0.0.1"), 8888);
            // 3、通过udp的socket服务将数据包发送出去
            ds.send(dp);
            // 4、关闭socket服务
        }
        ds.close();
    }
}
