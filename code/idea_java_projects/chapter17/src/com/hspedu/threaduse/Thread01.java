package com.hspedu.threaduse;

/**
 * @Author:李强
 * @Date:2025/5/11
 * @Description:chapter17
 */

public class Thread01 {
    public static void main(String[] args) {

        //创建Cat对象，可以当成线程使用
        Cat cat = new Cat();
        //cat.start();//启动线程-> 最终会执行cat的run方法
        /*
            (1)
            public synchronized void start() {
                start0();
            }
            (2)
            //start0() 是本地方法，是JVM调用，底层是c/c++实现
            //真正实现多线程的效果，是start0()，而不是run

         */
        cat.start();
        //cat.run();//调用run方法
    }
}

//1、当一个类继承了Thread类，该类就可以当作线程使用
//2、我们会重写run方法，写上自己的业务代码
//3、run Thread类实现了Runnable 接口的run方法
class Cat extends Thread {

    int times = 0;
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑

        while (true) {
            //该线程每隔1秒。在控制台输出"喵喵，我是小猫咪"
            System.out.println("喵喵，我是小猫咪" + (++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 8) {
                break;
            }
        }

    }
}
