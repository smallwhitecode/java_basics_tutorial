package com.hspedu.abstract_;

/**
 * @Author:李强
 * @Date:2025/3/12
 * @Description:chapter10
 */

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //思考：这里eat 这里你实现了，其实没有什么意义
    //即：父类方法不确定性的问题
    //===> 考虑将该方法设计为抽象(abstract)方法
    //===> 所谓抽象方法就是没有实现的方法
    //===> 所谓没有实现就是指，没有方法体
    //public void eat() {
    //    System.out.println("这是一个动物，但是不知道吃什么..");
    //}

    public abstract void eat();
}
