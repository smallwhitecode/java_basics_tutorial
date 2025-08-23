package com.hspedu.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Author:李强
 * @Date:2025/6/26
 * @Description:chapter19
 */

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {

        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "e:\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        //序列化数据到 filePath
        oos.writeInt(100); // int -> Integer (实现了Serializable)
        oos.writeBoolean(true);// boolean -> Boolean (实现了Serializable)
        oos.writeChar('a');// char -> Character (实现了Serializable)
        oos.writeDouble(9.5);// double -> Double (实现了Serializable)
        oos.writeUTF("一定要开心啊");//String
        //保存一个Dog 对象
        oos.writeObject(new Dog("旺财", 10));
        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}

class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
