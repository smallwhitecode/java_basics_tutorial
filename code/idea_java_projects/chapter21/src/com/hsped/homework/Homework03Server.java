package com.hsped.homework;

import com.hsped.upload.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:李强
 * @Date:2025/8/3
 * @Description:chapter21
 */

public class Homework03Server {
    public static void main(String[] args) throws Exception {
        //监听 8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端监听8889端口信息....");
        //等待客户端连接
        Socket socket = serverSocket.accept();
        //读取 客户端发送要下载的文件名
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);

        System.out.println("服务端开始发送音乐");
        String music = "";
        if ("高山流水".equals(s)) {
            music = "高山流水.mp3";
        } else {
            music = "无名.mp3";
        }
        String filePath = "src\\" + music;
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bos.flush();
        socket.shutdownOutput();
        System.out.println("服务端发送音乐成功");

        bos.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }
}
