package com.hspedu.interface_;

/**
 * @Author:李强
 * @Date:2025/3/16
 * @Description:chapter10
 */
//A程序
public class MysqlDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
