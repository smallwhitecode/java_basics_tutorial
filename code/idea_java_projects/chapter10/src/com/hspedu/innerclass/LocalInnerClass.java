package com.hspedu.innerclass;

/**
 * @Author:李强
 * @Date:2025/3/17
 * @Description:chapter10 演示局部内部类的使用
 */

public class LocalInnerClass {
    public static void main(String[] args) {

    }
}

class Outer02 {//外部类
    private int n1 = 100;
    private void m2(){}//私有方法
    public void m1() {
        //1、局部内部类是定义在外部类的局部位置，通常在方法
        //3、不能添加访问修饰符，但是可以使用final修饰
        class Inner02 {//局部内部类(本质任然是一个类)
            //2、可以直接访问外部类的所有成员，包含私有的
            public void f1() {
                System.out.println("n1=" + n1);
                m2();
            }
        }
        class Inner03 extends Inner02 {

        }
    }
}
