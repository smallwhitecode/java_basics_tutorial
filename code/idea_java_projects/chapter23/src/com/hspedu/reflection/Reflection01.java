package com.hspedu.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author:李强
 * @Date:2025/8/15
 * @Description:chapter23
 */

public class Reflection01 {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.getProperty("classfullpath");//"com.hspedu.Cat"
        String methodName = properties.getProperty("method");//"hi"
        //2、使用反射机制解决
        //(1) 加载类，返回class类型的对象cls
        Class cls = Class.forName(classfullpath);
        System.out.println("class的运行类型" + cls.getClass());
        //(2) 通过 cls 得到你加载的类 com.hspedu.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型" + o.getClass());//运行类型
        //(3) 通过 cls 得到你加载的类 com.hspedu.Cat 的 methodName "hi" 的方法对象
        Method method1 = cls.getMethod(methodName);
        //(4) 通过method1 调用方法：即通过方法对象来实现调用方法
        method1.invoke(o);//传统方法 对象.方法()，反射机制 方法.invoke(对象)

        //java.lang.reflect.Field: 代表类的成员变量, Field 对象表示某个类的成员变量
        //得到name字段 getField不能得到私有的属性
        Field nameField = cls.getField("age");
        System.out.println(nameField.get(o));// 传统写法对象.成员变量, 反射: 成员变量对象.get(对象)

        //java.lang.reflect.Constructor: 代表类的构造方法, Constructor 对象表示构造器
        Constructor constructor = cls.getConstructor();//()中可以指定构造器参数类型, 返回无参构造器
        System.out.println(constructor);

        Constructor constructor1 = cls.getConstructor(String.class);//这里传入的String.class 就是String 类的Class 对象
        System.out.println(constructor1);
    }
}
