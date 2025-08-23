package com.hspedu.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author:李强
 * @Date:2025/5/29
 * @Description:chapter17
 * (1)在 main 方法中启动两个线程
 * (2)第 1 个线程循环随机打印 100 以内的整数
 * (3)直到第 2 个线程从键盘读取了 “Q” 命令
 */

public class HomeWork01 {
    public static void main(String[] args) {
        A a = new A();
        a.start();

        Thread thread = new Thread(new B(a));
        thread.start();

    }
}

class A extends Thread {
    private boolean flag = true;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag) {
            Random random = new Random();
            System.out.println(random.nextInt(100) + 1);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A线程退出");
    }
}

class B implements Runnable {

    private A a;

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入指令：");
            String next = scanner.nextLine();
            if (next.equals("Q")) {
                a.setFlag(false);
                System.out.println("B线程退出");
                break;
            }
        }
    }
}