package com.hspedu.inputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @Author:李强
 * @Date:2025/6/26
 * @Description:chapter19
 */

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception{

        //指定反序列化的文件
        String filePath = "e:\\data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println("运行类型="+dog.getClass());
        System.out.println("dog信息=" + dog);
        // 3.关闭
        ois.close();
        System.out.println("以反序列化的方式读取(恢复)ok~");

    }
}
