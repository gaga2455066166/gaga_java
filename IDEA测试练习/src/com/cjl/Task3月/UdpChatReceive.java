package com.cjl.Task3月;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpChatReceive implements Runnable {
    private int receivePort;

    public UdpChatReceive(int receivePort) {
        this.receivePort = receivePort;
    }

    @Override
    public void run() {
        try {
            byte[] buf = new byte[1024];
            DatagramSocket ds = new DatagramSocket(receivePort);
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            ds.receive(dp);
            String str = new String(dp.getData());
            String ip = dp.getAddress().getHostAddress();
            System.out.println("接收" + ip + "的消息：" + str);
            ds.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
