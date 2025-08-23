package com.hspedu.customgeneric;

/**
 * @Author:李强
 * @Date:2025/4/26
 * @Description:chapter15
 */

public class CustomGeneric {
    public static void main(String[] args) {

    }
}

class Tiger<T,R, M> {
    String name;
    R r;
    T t;
    M m;

    public Tiger(String name, R r, T t, M m) {
        this.name = name;
        this.r = r;
        this.t = t;
        this.m = m;
    }

    public void m1(R r) {

    }
}
