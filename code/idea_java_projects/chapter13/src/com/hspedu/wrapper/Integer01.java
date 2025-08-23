package com.hspedu.wrapper;

/**
 * @Author:李强
 * @Date:2025/3/24
 * @Description:chapter13
 */

public class Integer01 {
    public static void main(String[] args) {
        //手动装箱 int -> Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        //Integer -> int
        int i = integer.intValue();

        //jdk5后，就可以自动装箱和自动拆箱
        Integer integer2 = n1;//底层使用的是 Integer.valueOf(n2)
        //自动拆箱 Integer -> int
        int n3 = integer2;//底层使用的是intValue()方法
    }
}
