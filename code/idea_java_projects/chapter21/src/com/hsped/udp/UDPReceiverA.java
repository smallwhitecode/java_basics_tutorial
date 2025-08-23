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

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1. 创建一个DatagramSocket 对象，准备在9999 接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2、构建一个 DatagramPacket 对象，准备接收数据
        // 一个UDP数据包最大64k
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        System.out.println("接收端A等待接收数据....");
        //3、调用接收方法 将通过网络传输的DatagramPacket 对象,填充到packet 对象
        //当有数据包发送到本机的9999 端口时，就会接收到数据
        // 如果没有数据包发送到本机的9999 端口, 就会阻塞等待
        socket.receive(packet);

        //4、可以把packet 进行拆包，取出数据，并显示
        int length = packet.getLength();// 实际接收到的数据长度
        byte[] data = packet.getData();// 接收到数据

        String s = new String(data, 0, length);
        System.out.println(s);

        //5. 回复信息给B端,将需要发送的数据，封装到DatagramPacket 对象
        data = "接收端：好的，明天见".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.0.108"), 9998);
        socket.send(packet);

        socket.close();
        System.out.println("A端退出");

    }
}
