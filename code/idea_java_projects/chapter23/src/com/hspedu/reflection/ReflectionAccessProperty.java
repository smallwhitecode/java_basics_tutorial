package com.hspedu.reflection;

import java.lang.reflect.Field;

/**
 * @Author:李强
 * @Date:2025/8/20
 * @Description:chapter23
 * 演示反射操作属性
 */

public class ReflectionAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {


        //1、得到Student类对应的 Class对象
        Class<?> stuClass = Class.forName("com.hspedu.reflection.Student");
        //2、创建对象
        Object o = stuClass.newInstance();//o 的运行类型就是Student类型
        System.out.println(o.getClass());//class com.hspedu.reflection.Student
        System.out.println(o);
        //3、使用反射得到age属性对象
        Field age = stuClass.getField("age");
        age.set(o, 88);//通过反射来操作属性
        System.out.println(o);
        System.out.println(age.get(o));
        //4、使用反射操作name属性
        Field name = stuClass.getDeclaredField("name");
        //对name 进行暴破, 可以操作private 属性
        name.setAccessible(true);
        name.set(o, "lq");
        System.out.println(o);
        System.out.println(name.get(o));

        name.set(null, "小红");//因为name 是static属性，因此o 也可以用null
        System.out.println(name.get(null));//获取属性值, 要求name 是static
        System.out.println(o);
    }
}

class Student {
    public int age;
    private static String name;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student [age=" + age + ",name=" + name + "]";
    }
}
