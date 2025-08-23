package com.hsped.homework;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Author:李强
 * @Date:2025/8/3
 * @Description:chapter21
 */

public class Homework02SenderB {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8889);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入问题：");
        String question = scanner.next();
        byte[] buf = question.getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.0.108"), 8888);
        socket.send(packet);

        buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        socket.close();
        System.out.println("发送端B退出....");
    }
}
