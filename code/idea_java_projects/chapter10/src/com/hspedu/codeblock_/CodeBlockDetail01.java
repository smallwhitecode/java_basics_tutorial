package com.hspedu.codeblock_;

/**
 * @Author:李强
 * @Date:2025/3/11
 * @Description:chapter10
 */

public class CodeBlockDetail01 {
    public static void main(String[] args) {

        //类被加载的情况举例
        //1.创建对象实例时(new)
        //AA aa = new AA();
        //2.创建子类对象实例，父类也会被加载，而且，父类先被加载，子类后被加载
        //AA aa2 = new AA();
        //3.使用类的静态成员时(静态属性，静态方法)
        //System.out.println(Cat.n1);

        //static代码块，是在类加载时，执行的，而且只会执行一次
        //DD dd = new DD();
        //DD dd1 = new DD();

        //普通的代码块，在创建对象实例时，会被隐式的调用。被创建一次，
        // 就会调用一次。如果只是使用类的静态成员时，普通代码块并不会执行
        System.out.println(DD.n1);//8888，静态代码块一定会执行
    }
}

class DD {
    public static int n1 = 8888;
    //静态代码块
    static {
        System.out.println("DD 的静态代码块1被执行");
    }
    //普通代码块，在new对象时，被调用，而且时每创建一个对象，就调用一次
    //
    {
        System.out.println("DD 的普通代码块1被执行");
    }
}

class Cat {
    public static int n1 = 999;//静态属性

    //静态代码块
    static {
        System.out.println("Cat 的静态代码块1被执行");
    }
}

class BB {
    //静态代码块
    static {
        System.out.println("BB 的静态代码块1被执行");
    }
}

class AA extends BB {

    //静态代码块
    static {
        System.out.println("AA 的静态代码块1被执行");
    }
}