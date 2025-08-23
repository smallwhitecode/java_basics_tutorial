package com.hspedu.final_;

/**
 * @Author:李强
 * @Date:2025/3/12
 * @Description:chapter10
 */

public class Final01 {
    public static void main(String[] args) {

    }
}

//如果我们要求A类不能被其他类继承
final class A {

}

//class B extends A {}

class C {
    //如果我们要求hi不能被子类重写
    //可以使用final修饰 hi方法
    public final void hi() {

    }
}

class D extends C {
    //@Override
    //public void hi() {
    //    System.out.println("重写了C类的hi方法");
    //}
}
