package com.hsped.api;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author:李强
 * @Date:2025/7/18
 * @Description:chapter21
 * 演示 InetAddress
 */

public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        //1、获取本机的InetAddress
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//Administrator/192.168.100.1

        //2、根据指定主机名获取 ip 地址对象
        InetAddress host1 = InetAddress.getByName("Administrator");
        System.out.println("host1=" + host1);//Administrator/192.168.100.1

        //3、根据 域名 获取 InetAddress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);

        //4、 通过 InetAddress 对象，获取对应地址
        String hostAddress = host2.getHostAddress();
        System.out.println("host2对象的ip = " + hostAddress);

        //5、获取 InetAddress 对象的主机名/或者域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名= " + hostName);
    }
}
