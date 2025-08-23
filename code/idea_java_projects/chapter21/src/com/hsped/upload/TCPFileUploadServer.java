package com.hsped.upload;

import java.io.*;
import java.net.ServerSocket;
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

public class TCPFileUploadServer {
    public static void main(String[] args) throws IOException {
        //1、服务端在本机监听8888
        ServerSocket serverSocket = new ServerSocket(8888);
        //2、等待连接
        System.out.println("服务端监听8888端口....");
        Socket socket = serverSocket.accept();

        //3、读取客户端发送的数据，通过socket得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //4、将得到bytes数组，写入到指定的路径，就得到一个文件了
        String filePath = "src\\a.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);
        //向客户端发送"收到图片" 通过socket 获取到输出流(字符)
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片");
        writer.flush();
        // 设置结束标记
        socket.shutdownOutput();

        // 关闭其他资源
        writer.close();
        bos.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
