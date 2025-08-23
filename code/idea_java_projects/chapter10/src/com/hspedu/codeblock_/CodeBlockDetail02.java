package com.hspedu.codeblock_;

/**
 * @Author:李强
 * @Date:2025/3/11
 * @Description:chapter10
 */

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A(); //(1)getN1被调用.... (2)A 静态代码块01
    }
}

class A {
    //静态属性的初始化
    private static int n1 = getN1();

    static {
        System.out.println("A 静态代码块01");
    }

    public static int getN1() {
        System.out.println("getN1被调用....");
        return 100;
    }
}
