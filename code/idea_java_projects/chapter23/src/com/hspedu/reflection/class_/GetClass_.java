package com.hspedu.reflection.class_;

import com.hspedu.Car;

/**
 * @Author:李强
 * @Date:2025/8/18
 * @Description:chapter23
 * 演示得到Class对象的各种方式(6)
 */

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {

        //1、Class.forName
        String classAllPath = "com.hspedu.Car";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);

        //2、类名.class，应用场景：用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);

        //3、对象.getClass()，应用场景，有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        //4、通过类加载器【4种】来获取到类的Class对象
        //(1)先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //5、基本数据（int,char,boolean,float,double,byte,long,short）按如下方式得到Class类对象
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;

        //6、基本数据类型对应的包装类，可以通过 .TYPE 得到 Class 类对象
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);
    }
}
