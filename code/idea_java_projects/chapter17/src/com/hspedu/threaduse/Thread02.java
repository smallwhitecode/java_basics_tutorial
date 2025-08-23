package com.hspedu.threaduse;

/**
 * @Author:李强
 * @Date:2025/5/11
 * @Description:chapter17 通过实现接口Runnable 来开发线程
 */

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start(); 这里不能调用start
        //创建了Thread对象，把dog对象(实现Runnable)，放入Thread
        Thread thread = new Thread(dog);
        thread.start();

        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}

class Animal {

}
class Tiger extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫....");
    }
}

//线程代理类
class ThreadProxy implements Runnable {

    private Runnable target = null;

    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定(运行类型Tiger)
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();//这个方法时真正实现多线程方法
    }

    public void start0() {
        run();
    }
}

class Dog implements Runnable {

    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
