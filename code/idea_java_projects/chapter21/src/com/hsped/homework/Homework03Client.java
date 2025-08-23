package com.hsped.homework;

import com.hsped.upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author:李强
 * @Date:2025/8/3
 * @Description:chapter21
 */

public class Homework03Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        //键盘输入问题
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查询音乐名：");
        String downMusic = scanner.next();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(downMusic);
        bw.newLine();
        bw.flush();
        socket.shutdownOutput();

        System.out.println("客户端开始接收音乐");
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        String destFilePath = "e:\\" + downMusic + ".mp3";

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.flush();
        System.out.println("客户端接收音乐成功");

        bos.close();
        bis.close();
        bw.close();
        socket.close();
        System.out.println("客户端退出...");
    }
}
