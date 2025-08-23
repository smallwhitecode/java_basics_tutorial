package com.hspedu.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author:李强
 * @Date:2025/8/20
 * @Description:chapter23
 */

public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //通过反射修改私有成员变量
        //1.定义 PrivateTest 类， 有私有 name 属性，属性值为 hellokitty
        //2.提供 getName 的公有方法
        //3.利用 Class 类得到私有的 name 属性，修改私有的 name 属性值，并调用 getName() 的方法打印 name 属性值

        Class<?> cls = Class.forName("com.hspedu.homework.PrivateTest");
        Object o = cls.newInstance();
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o, "小明");
        Method getName = cls.getMethod("getName");
        Object returnValue = getName.invoke(o);
        System.out.println(returnValue);


    }
}

class PrivateTest {
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}
