package com.hsped.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author:李强
 * @Date:2025/8/2
 * @Description:chapter21
 */

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket 对象，准备在9998 端口接收数据
        DatagramSocket socket = new DatagramSocket(9998);
        //2. 将需要发送的数据，封装到DatagramPacket 对象
        byte[] data = "hello 明天吃火锅".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.0.108"), 9999);
        socket.send(packet);

        //3. 接收从A 端回复的信息
        //(1).构建一个DatagramPacket 对象，准备接收数据
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        //(2) 调用接收方法, 将通过网络传输的DatagramPacket 对象,填充到packet 对象
        socket.receive(packet);
        //(3) 可以把packet 进行拆包，取出数据，并显示
        int length = packet.getLength();
        data = packet.getData();

        String s = new String(data, 0, length);
        System.out.println(s);


        //关闭资源
        socket.close();
        System.out.println("B端退出");
    }
}
