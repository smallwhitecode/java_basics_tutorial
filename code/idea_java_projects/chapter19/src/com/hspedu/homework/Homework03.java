package com.hspedu.homework;

import java.io.*;
import java.util.Properties;

/**
 * @Author:李强
 * @Date:2025/6/27
 * @Description:chapter19
 */

public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建 Properties 对象
        Properties properties = new Properties();
        properties.load(new FileReader("src\\dog.properties"));
        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);

        //(3)将创建的Dog对象,序列化到文件dog.dat文件
        String filePath = "e:\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(dog);
        oos.close();
        System.out.println("数据保存完毕(序列化形式)");

        //(4)再读取 dog.dat 并反序列化恢复数据
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readObject());
        ois.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
