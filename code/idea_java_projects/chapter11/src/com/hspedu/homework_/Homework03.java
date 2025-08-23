package com.hspedu.homework_;

/**
 * @Author:李强
 * @Date:2025/3/22
 * @Description:chapter11
 */

public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}

abstract class Animal {
    public abstract void shout();
}
class Cat extends Animal {

    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}
class Dog extends Animal {

    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}
