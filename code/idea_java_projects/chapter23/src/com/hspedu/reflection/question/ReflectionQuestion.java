package com.hspedu.reflection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author:李强
 * @Date:2025/8/14
 * @Description:chapter23
 */

public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //根据配置文件 re.properties 指定信息，创建Cat对象并调用方法hi
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.getProperty("classfullpath");//"com.hspedu.Cat"
        String methodName = properties.getProperty("method");//"hi"
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + methodName);

        //2、使用反射机制解决
        //(1) 加载类，返回class类型的对象cls
        Class cls = Class.forName(classfullpath);
        //(2) 通过 cls 得到你加载的类 com.hspedu.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型" + o.getClass());//运行类型
        //(3) 通过 cls 得到你加载的类 com.hspedu.Cat 的 methodName "hi" 的方法对象
        Method method1 = cls.getMethod(methodName);
        //(4) 通过method1 调用方法：即通过方法对象来实现调用方法
        method1.invoke(o);//传统方法 对象.方法()，反射机制 方法.invoke(对象)

    }
}
