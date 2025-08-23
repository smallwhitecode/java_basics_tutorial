package com.hspedu.ticket;

/**
 * @Author:李强
 * @Date:2025/5/11
 * @Description:chapter17
 * 使用多线程，模拟三个窗口同时售票100张
 */

public class SellTicket {
    public static void main(String[] args) {

        //测试
        //SellTicket01 sellTicket01 = new SellTicket01();
        //SellTicket01 sellTicket02 = new SellTicket01();
        //SellTicket01 sellTicket03 = new SellTicket01();
        //
        ////这里会出现票数超卖
        //sellTicket01.start();
        //sellTicket02.start();
        //sellTicket03.start();


        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
    }
}

//使用Thread方式
class SellTicket01 extends Thread {
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }

            //休眠50毫秒,模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName()
                    + " 售出一张票" + "剩余票数=" + (--ticketNum));
        }
    }
}

//实现接口方式
class SellTicket02 implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }

            //休眠50毫秒,模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName()
                    + " 售出一张票" + "剩余票数=" + (--ticketNum));
        }
    }
}