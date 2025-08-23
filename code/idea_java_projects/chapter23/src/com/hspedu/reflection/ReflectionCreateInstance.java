package com.hspedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author:李强
 * @Date:2025/8/19
 * @Description:chapter23
 * 演示通过反射机制创建实例
 */

public class ReflectionCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //1、先获取到User类的Class对象
        Class userClass = Class.forName("com.hspedu.reflection.User");
        //2、通过public的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
        //3、通过public的有参构造器创建实例
        //3.1 先得到对应构造器
        Constructor constructor = userClass.getConstructor(String.class);
        //3.2 创建实例，并传入实参
        Object lq = constructor.newInstance("lq");
        System.out.println(lq);
        //4、通过非public的有参构造器创建实例
        //4.1 得到private 的构造器对象
        Constructor declaredConstructor = userClass.getDeclaredConstructor(int.class, String.class);
        //4.2 创建实例
        //暴破【暴力破解】, 使用反射可以访问private 构造器/方法/属性
        declaredConstructor.setAccessible(true);
        Object o1 = declaredConstructor.newInstance(100, "张三丰");
        System.out.println(o1);
    }
}

class User {
    private int age = 10;
    private String name = "李强";

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    private User(int age,String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}