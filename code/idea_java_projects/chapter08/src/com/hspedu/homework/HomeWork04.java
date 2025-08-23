package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/1/14
 * @Description:chapter08
 */

public class HomeWork04 {
    public static void main(String[] args) {
        Manager manager = new Manager("刘备", 100, 20, 1.2);
        //设置奖金
        manager.setBonus(3000);
        manager.printSalary();

        Worker worker = new Worker("关羽", 50, 10, 1.0);
        worker.printSalary();
    }
}
