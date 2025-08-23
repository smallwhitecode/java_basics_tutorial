package com.hsped.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author:李强
 * @Date:2025/7/18
 * @Description:chapter21
 */
@SuppressWarnings({"all"})
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        //1. 连接服务端(ip , 端口）如果连接成功，返回Socket 对象
        //解读：连接本机的9999端口，如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回=" + socket.getClass());
        //2、连接上后，生成Socket，通过socket.getOutputStream()
        OutputStream outputStream = socket.getOutputStream();
        //3、通过输出流，写入数据到数据通道
        outputStream.write("hello, server".getBytes());
        // 设置结束标记
        socket.shutdownOutput();
        //4、获取和socket关联的输入流，读取数据(字节)，并显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLine = 0;
        while ((readLine = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLine));
        }
        //5、关闭流对象和socket，必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出....");
    }
}





