package com.hspedu.method;

/**
 * @Author:李强
 * @Date:2025/5/11
 * @Description:chapter17
 */

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程(小弟) 吃了" + i + "包子");
            if (i == 5) {
                System.out.println("主线程(小弟) 让 子线程(老大)先吃");
                //t2.join();
                Thread.yield();//礼让  不一定成功
                System.out.println("老大吃完小弟接着吃");
            }
        }
    }
}

class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程：hello"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程(老大) 吃了 " + i + "包子");
        }

    }
}
