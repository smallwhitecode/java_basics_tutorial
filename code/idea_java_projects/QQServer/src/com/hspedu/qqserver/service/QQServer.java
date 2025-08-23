package com.hspedu.qqserver.service;

import com.hspedu.qqcommon.Message;
import com.hspedu.qqcommon.MessageType;
import com.hspedu.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:李强
 * @Date:2025/8/6
 * @Description:QQServer 这是服务器，在监听9999，等待客户端的连接，并保持通信
 */

public class QQServer {

    private ServerSocket ss = null;

    private static ConcurrentHashMap<String, User> validUsers = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, ArrayList<Message>> offLineDb = new ConcurrentHashMap<>();

    static {
        validUsers.put("100", new User("100", "123456"));
        validUsers.put("200", new User("200", "123456"));
        validUsers.put("300", new User("300", "123456"));
        validUsers.put("至尊宝", new User("至尊宝", "123456"));
        validUsers.put("紫霞仙子", new User("紫霞仙子", "123456"));
        validUsers.put("菩提老祖", new User("菩提老祖", "123456"));
    }

    //验证用户是否有效的方法
    private boolean checkUser(String userId, String password) {
        User user = validUsers.get(userId);
        if (user == null) {//说明userId没有存在validUsers 的key中
            return false;
        }
        if (!user.getPassword().equals(password)) {//userId正确，但是密码错误
            return false;
        }
        return true;
    }

    public QQServer() {
        try {
            System.out.println("服务端在9999端口监听....");
            new Thread(new SendNewsToAllService()).start();
            ss = new ServerSocket(9999);

            while (true) {//当和某个客户端连接后，会继续监听，因此while
                Socket socket = ss.accept();//如果没有客户端连接，就会阻塞
                //得到socket关联的对象输入流
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

                //得到socket关联的对象输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                User user = (User) ois.readObject();
                //创建一个Message对象，准备回复客户端
                Message message = new Message();
                //验证
                if (checkUser(user.getUserId(), user.getPassword())) {//登录通过
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将Message对象回复客户端
                    oos.writeObject(message);
                    //遍历离线消息
                    if (offLineDb.get(user.getUserId()) != null) {
                        for (Message offline : offLineDb.get(user.getUserId())) {
                            sendOfflineInfo(offline, socket);
                        }
                        offLineDb.remove(user.getUserId());
                    }

                    //创建一个线程，和客户端保持通信，该线程需要持有socket对象
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, user.getUserId());
                    serverConnectClientThread.start();
                    //把该线程对象，放入到一个集合中，进行管理
                    ManageClientThreads.addClientThread(user.getUserId(), serverConnectClientThread);


                } else {//登录失败
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    socket.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //如果服务器退出while，说明服务端不在监听，因此关闭serverSocket
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void sendOfflineInfo(Message offline,Socket socket) {
        try {
            //这里客户端的输入流变更了，因此这里每次都需要重新开新的输出流
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(offline);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
