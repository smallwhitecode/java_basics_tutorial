package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/5/29
 * @Description:chapter17
 * (1)有 2 个用户分别从同一个卡上取钱(总额: 10000)
 * (2)每次都取 1000，当余额不足时，就不能取款了
 * (3)不能出现超取现象=》线程同步问题
 */

public class HomeWork02 {
    public static void main(String[] args) {

        Card card = new Card();

        Thread thread1 = new Thread(card);
        thread1.setName("t1");
        Thread thread2 = new Thread(card);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
    }
}

//编程取款的线程
//1、因为这里涉及到多个线程共享资源，所以我们使用实现Runnable方式
class Card implements Runnable {
    private int money = 10000;

    @Override
    public void run() {
        while (true) {
            //解读
            //1、这里使用 synchronized 实现了线程同步
            //2、当多个线程执行到这里时，就会去争夺 this 对象锁
            //3、哪个线程争夺到(获取)this对象锁，就执行 synchronized 代码块
            //4、争夺不到this对象锁，就blocked，准备继续争夺
            //5、this对象锁是非公平锁
            synchronized (this) {
                if (money < 1000) {
                    System.out.println("余额不足1000，无法取钱");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取走了1000" + "剩余" + money);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}