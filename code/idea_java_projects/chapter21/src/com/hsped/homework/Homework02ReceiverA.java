package com.hsped.homework;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author:李强
 * @Date:2025/8/3
 * @Description:chapter21
 */

public class Homework02ReceiverA {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8888);

        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);
        socket.receive(packet);

        int length = packet.getLength();
        byte[] data = packet.getData();

        String s = new String(data, 0, length);

        String answer = "";
        if (s.equals("四大名著是哪些")) {
            answer = "四大名著是《红楼梦》";
        } else {
            answer = "what";
        }

        buf = answer.getBytes();
        packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.0.108"), 8889);
        socket.send(packet);

        socket.close();
        System.out.println("接收端A退出....");
    }
}
