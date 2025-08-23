package com.hsped.socket;

import com.hsped.User;

import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @Author:李强
 * @Date:2025/8/12
 * @Description:chapter21
 */

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 9998);


        try {
            while (true) {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                User user = (User) ois.readObject();
                System.out.println("接收到用户信息：" + user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }

    }
}
