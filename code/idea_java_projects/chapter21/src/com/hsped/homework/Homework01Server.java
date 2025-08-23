package com.hsped.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:李强
 * @Date:2025/8/3
 * @Description:chapter21
 */

public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端监听8888端口...");

        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);

        String answer = "";
        if (s != null && s.equals("name")) {
            answer = "我是nova";
        } else if (s != null && s.equals("hobby")) {
            answer = "编写java程序";
        } else {
            answer = "你说啥呢";
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(answer);
        bw.newLine();
        bw.flush();
        //关闭资源
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器退出.....");
    }
}
