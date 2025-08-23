package com.hspedu.interface_;

/**
 * @Author:李强
 * @Date:2025/3/17
 * @Description:chapter10
 */

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(A.a);
        System.out.println(B.a);
    }
}

interface A {
    int a = 23;
}

class B implements A {

}

