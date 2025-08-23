package com.hspedu.annotation_;

/**
 * @Author:李强
 * @Date:2025/3/22
 * @Description:chapter11
 */

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
    }
}
//1、@Deprecated 修饰某个元素，表示该元素已经过时
//2、即不在推荐使用，但是任然可以使用
@Deprecated
class A {
    public int n1 = 10;
    public void hi() {

    }
}