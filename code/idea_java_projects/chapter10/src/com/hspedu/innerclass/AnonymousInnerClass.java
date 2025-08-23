package com.hspedu.innerclass;

/**
 * @Author:李强
 * @Date:2025/3/17
 * @Description:chapter10
 *
 * 演示匿名内部类的使用
 */

public class AnonymousInnerClass {
    public static void main(String[] args) {


    }
}

class Outer04 {//外部类
    private int n1 = 10;

    public void method() {
        //基于接口的匿名内部类
        //1、需求： 想使用IA接口，并创建对象
        //2、传统方式，是写一个类，实现该接口，并创建对象
        //3、需求是Tiger/Dog 类只是使用一次，后面不再使用
        //4、可以使用匿名内部类来简化开发
        //5、tiger的编译类型 ？ IA
        //6、tiger的运行类型 ？ 就是匿名内部类
        /*
            底层 会分配 类名 Outer04$1
            class Outer04$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎叫唤...");
                }
            }
         */
        //7、jdk底层在出啊关键匿名内部类 Outer04$1,立即马上就创建了 Outer04$1实例，并且把地址
        //      返回给tiger
        //8、匿名内部类使用一次，就不能在使用，对象是可以反复使用的
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
        tiger.cry();
        tiger.cry();

        //Tiger tiger = new Tiger();
        //tiger.cry();

        //演示基于类的匿名内部类
        //分析
        //1、father编译类型  Father
        //2、father运行类型 Outer04$2

        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重新了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());
        father.test();

        Animal animal=new Animal() {
            @Override
            void eat() {

            }
        };

    }
}

interface IA {
    void cry();
}

//class Tiger implements IA {
//    public Tiger() {
//    }
//
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤...");
//    }
//}

class Father {
    private String name;

    public Father(String name) {
        this.name = name;
    }
    public void test(){}
}

abstract class Animal {
    abstract void eat();
}