package com.hspedu.object_;

/**
 * @Author:李强
 * @Date:2025/1/5
 * @Description:chapter08
 */

public class Equals01 {

    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        B bObj = b;
        System.out.println(bObj == c);//true
    }
}

class B {}
class A extends B{}
