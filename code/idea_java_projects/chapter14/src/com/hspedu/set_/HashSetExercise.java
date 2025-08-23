package com.hspedu.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author:李强
 * @Date:2025/4/8
 * @Description:chapter14
 */

public class HashSetExercise {
    public static void main(String[] args) {

        Employee java = new Employee("java", 20,new MyDate(2025,4,10));
        Employee lq = new Employee("lq", 20, new MyDate(2025, 4, 10));
        Employee jack = new Employee("java", 20, new MyDate(2025, 4, 10));
        HashSet set = new HashSet();
        set.add(java);
        set.add(lq);
        set.add(jack);
        System.out.println("set=" + set.toString());
    }
}

class Employee {
    private String name;
    private int age;
    private MyDate myDate;

    public Employee(String name, int age, MyDate myDate) {
        this.name = name;
        this.age = age;
        this.myDate = myDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(myDate, employee.myDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, myDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", myDate=" + myDate +
                '}';
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
