package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/1/14
 * @Description:chapter08
 */

public class Employee {
    private String name;
    private double daySalary;
    private int workDays;
    private double grade;

    public Employee(String name, double daySalary, int workDays, double grade) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //打印工资方法
    public void printSalary() {
        System.out.println(name + "工资=" + daySalary * workDays * grade);
    }
}
