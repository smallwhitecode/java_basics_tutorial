package com.hspedu.qqclient.view;

import com.hspedu.qqclient.service.FileClientService;
import com.hspedu.qqclient.service.MessageClientService;
import com.hspedu.qqclient.service.UserClientService;
import com.hspedu.qqclient.uitls.Utility;

/**
 * @Author:李强
 * @Date:2025/8/5
 * @Description:QQClient
 * 客户端的菜单界面
 */

public class QQView {

    private boolean loop = true;//控制是否显示菜单
    private String key = "";//接收用户的键盘输入
    private UserClientService userClientService = new UserClientService();//对象是用于登录服务/注册用户
    private MessageClientService messageClientService = new MessageClientService();
    private FileClientService fileClientService = new FileClientService();//该对象用于传输文件

    public static void main(String[] args) {
        new QQView().mainMenu();
        System.out.println("客户端退出系统......");
    }

    private void mainMenu() {
        while (loop) {

            System.out.println("=============欢迎登录网络通信系统==================");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");
            System.out.print("请输入你的选择：");

            key = Utility.readString(1);

            //根据用户的输入，来处理不同的逻辑
            switch (key) {
                case "1":
                    System.out.print("请输入用户号：");
                    String userId = Utility.readString(50);
                    System.out.print("请输入密 码：");
                    String pwd = Utility.readString(50);
                    //需要到服务端去验证该用户是否合法
                    //没有写完先写二级逻辑菜单  编写一个类 UserClientService[用户登录/注册]
                    if (userClientService.checkUser(userId, pwd)) {
                        System.out.println("=============欢迎 (用户 " + userId + ")==================");
                        //进入到二级菜单
                        while (loop) {
                            System.out.println("\n=============网络通信系统二级菜单(用户 " + userId + ")==================");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.print("请输入你的选择：");
                            key = Utility.readString(1);

                            switch (key) {
                                case "1":
                                    //System.out.println("显示在线用户列表");
                                    userClientService.onlineFriendList();
                                    break;
                                case "2":
                                    System.out.print("请输入想对大家说的话：");
                                    String s = Utility.readString(100);
                                    //调用一个方法，将消息封装成message对象，发送给服务端
                                    messageClientService.sendMessageToAll(s, userId);
                                    break;
                                case "3":
                                    //System.out.println("私聊消息");
                                    System.out.print("请输入想聊天的用户号(在线)：");
                                    String receiver = Utility.readString(100);
                                    System.out.print("请输入想说的话：");
                                    String content = Utility.readString(100);
                                    //将消息发送给服务端
                                    messageClientService.sendMessageToOne(content, userId, receiver);
                                    break;
                                case "4":
                                    //System.out.println("发送文件");
                                    System.out.print("请输入你想把文件发送给的用户(在线)：");
                                    receiver = Utility.readString(50);
                                    System.out.print("请输入发送文件的路径(形式 d:\\xx.png)：");
                                    String src = Utility.readString(100);
                                    System.out.print("请输入把文件发送到对应的路径(形式 d:\\yy.png)：");
                                    String dest = Utility.readString(100);
                                    fileClientService.sendFileToOne(src, dest, userId, receiver);
                                    break;
                                case "9":
                                    //给服务器发送退出系统message
                                    loop = false;
                                    userClientService.logOut();
                                    break;
                            }
                        }
                    } else { //登录服务器失败
                        System.out.println("=========登录失败============");
                    }
                    break;
                case "9":
                    System.out.println("退出系统");
                    loop = false;
                    break;
            }
        }
    }
}
