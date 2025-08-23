package com.hsped.socket;

import com.hsped.User;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:李强
 * @Date:2025/8/12
 * @Description:chapter21
 */

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9998);
        System.out.println("服务端等待通信");
        Socket socket = serverSocket.accept();

        User user = new User("11", "22");
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(user);
        user = new User("22","33");

        oos.writeObject(user);

        oos.close();
        socket.close();
        serverSocket.close();

    }
}
