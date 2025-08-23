package com.hspedu.qqclient.service;

import com.hspedu.qqcommon.Message;
import com.hspedu.qqcommon.MessageType;

import java.io.*;

/**
 * @Author:李强
 * @Date:2025/8/12
 * @Description:QQClient
 * 该类/对象完成 文件传输服务
 */

public class FileClientService {

    /**
     *
     * @param src 源文件
     * @param dest 把该文件传输给对方的那个目录
     * @param senderId 发送用户id
     * @param receiver 接收用户id
     */
    public void sendFileToOne(String src, String dest, String senderId, String receiver) {

        //读取src 文件  -->message
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_FILE_MES);
        message.setSender(senderId);
        message.setReceiver(receiver);
        message.setSrc(src);
        message.setDest(dest);

        //需要将文件读取
        FileInputStream fileInputStream = null;
        byte[] fileBytes = new byte[(int) new File(src).length()];

        try {
            fileInputStream = new FileInputStream(src);
            fileInputStream.read(fileBytes);//将src文读入到程序的字节数组
            //将文件对应的字节数组设置到message
            message.setFileBytes(fileBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭
            if (fileInputStream == null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //发送
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //提示信息
        System.out.println("\n" + senderId + " 给 " + receiver + " 发送文件：" + src + " 到对方的电脑的目录 " + dest);
    }
}
