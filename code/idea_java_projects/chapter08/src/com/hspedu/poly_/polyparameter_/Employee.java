package com.hspedu.poly_.polyparameter_;

/**
 * @Author:李强
 * @Date:2025/1/5
 * @Description:chapter08
 */

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //得到年工资的方法
    public double getAnnual() {
        return 12 * salary;
    }
}
