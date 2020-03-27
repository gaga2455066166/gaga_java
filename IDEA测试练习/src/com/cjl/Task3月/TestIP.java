package com.cjl.Task3月;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        InetAddress address = InetAddress.getByName("www.4399.com");
        System.out.println(local.getHostAddress());
        System.out.println(address.getHostAddress());
    }
}
