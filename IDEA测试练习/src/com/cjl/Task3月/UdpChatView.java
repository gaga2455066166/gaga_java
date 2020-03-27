package com.cjl.Task3月;

import java.util.Scanner;

public class UdpChatView {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的端口号：");
        int myPort = scan.nextInt();
        System.out.println("请输入对方端口号：");
        int sidePort = scan.nextInt();
        System.out.println("聊天小程序启动！");
        Thread sendThread = new Thread( new UdpChatSend(myPort));
        Thread receiveThread = new Thread(new UdpChatReceive(sidePort));

        sendThread.start();
        receiveThread.start();

    }
}
