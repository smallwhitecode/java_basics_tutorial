package com.hspedu.homework_;

/**
 * @Author:李强
 * @Date:2025/3/22
 * @Description:chapter11
 */

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}

class A {
    private String name = "hello";
    public void f1() {
        class B {
            private final String name = "礼尚轩";
            public void show() {
                System.out.println("name=" + name + "外部类的name=" + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
