package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/1/14
 * @Description:chapter08
 */

public class Worker extends Employee{
    public Worker(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    @Override
    public void printSalary() {
        super.printSalary();
    }
}
