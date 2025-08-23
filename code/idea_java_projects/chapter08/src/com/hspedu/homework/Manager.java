package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/1/14
 * @Description:chapter08
 */

public class Manager extends Employee {
    //特有属性
    private double bonus;

    //创建Manger对象时，奖金时多少并不是确定的，在构造器中，不给bonus，可以通过setBonus
    public Manager(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("经理 " + getName() + "工资是=" + (bonus +
                getDaySalary() * getWorkDays() * getGrade()));
    }
}
