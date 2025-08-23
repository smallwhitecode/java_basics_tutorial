package com.hspedu.homework_;

/**
 * @Author:李强
 * @Date:2025/3/22
 * @Description:chapter11
 */

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 8);
    }
}

interface Calculator {
    double work(double n1, double n2);
}

class Cellphone {

    public void testWork(Calculator calculator, double n1, double n2) {
        double result = calculator.work(n1, n2);
        System.out.println("计算后的结果=" + result);
    }
}
