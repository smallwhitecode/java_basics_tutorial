package com.hspedu.innerclass;

/**
 * @Author:李强
 * @Date:2025/3/19
 * @Description:chapter10
 */

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //第一种方式
        // outer08.new Inner08();相当于把 new Inner08()当作是outer08成员
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        //第二种方式
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
    }
}

class Outer08 {//外部类
    private int n1 = 10;
    public String name = "张三";

    public class Inner08 {//成员内部类
        public void say() {
            System.out.println("n1=" + n1 + "name=" + name);
        }
    }

    public Inner08 getInner08Instance() {
        return new Inner08();
    }

    //写方法
    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}