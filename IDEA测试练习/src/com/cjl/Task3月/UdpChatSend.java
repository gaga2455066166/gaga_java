package com.cjl.Task3月;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpChatSend implements Runnable {
    private int sendPort;

    public UdpChatSend(int sendPort) {
        this.sendPort = sendPort;
    }

    @Override
    public void run() {
        try {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            byte[] buf = new byte[1024];
            DatagramSocket ds = new DatagramSocket();
            DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), sendPort);
            ds.send(dp);
            ds.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
