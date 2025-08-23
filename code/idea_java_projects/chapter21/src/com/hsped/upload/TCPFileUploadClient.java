package com.hsped.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author:李强
 * @Date:2025/8/1
 * @Description:chapter21
 *
 * 1.编写一个服务端和一个客户端
 * 2.服务器端在 8888 端口监听
 * 3.客户端连接到服务端，发送一张图片 /Users/jianjian/Downloads/a.jpeg
 * 4.服务器端接收到客户端发送的图片，保存到 src 下，发送”收到图片”再退出
 * 5.客户端接收到服务端发送的”收到图片”，再退出
 * 6.该程序要求使用 StreamUtils.java，我们直接使用
 */

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //1.客户端连接服务端8888，得到Socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //2、创建读取文件磁盘的输入流
        System.out.println("客户端开始发送图片");
        String filePath = "e:\\a.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        //bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //3.通过socket 获取到输出流, 将bytes 数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        // 设置结束标志
        socket.shutdownOutput();

        //====接收从服务端回复的消息
        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        inputStream.close();
        bos.close();
        bis.close();
        socket.close();
    }
}
