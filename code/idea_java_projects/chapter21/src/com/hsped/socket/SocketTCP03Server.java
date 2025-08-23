package com.hsped.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:李强
 * @Date:2025/7/18
 * @Description:chapter21
 */
@SuppressWarnings({"all"})
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        //1. 监听本机的9999 端口, 等待连接
        // 细节：要求在本机没有其他服务在监听9999
        // 细节：这个ServerSocket 可以通过accept() 返回多个Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("我是服务端，正在监听9999端口，等待连接...");
        //2. 当没有客户端连接9999 端口时，程序会阻塞, 等待连接
        // 如果有客户端连接，则会返回Socket 对象，程序继续
        Socket socket = serverSocket.accept();

        System.out.println("服务端socket=" + socket.getClass());
        //3、通过socket.getInputStream() 读取客户端写入到数据通道的数据，显示
        InputStream inputStream = socket.getInputStream();
        //4、IO读取，使用字符流，使用InputStreamReader 将 inputStream转换
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //5、通过输出流，写入到数据通道
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client 字符流");
        bufferedWriter.newLine();// 插入一个换行符，表示回复内容结束
        bufferedWriter.flush();//需要手动刷新，否则数据不会写入数据通道

        //6、关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();

    }
}
