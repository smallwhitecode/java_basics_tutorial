package com.hspedu.encap;

/**
 * @Author:李强
 * @Date:2024/12/2
 * @Description:chapter08
 */

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        person.setSalary(6000);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: " + person.getSalary());

        // 以下代码是不合法的，因为age和salary是私有属性，不能直接通过person.age来修改
        // person.age = 30;
        // person.salary = 7000;
    }
}

/*
那么在java中如何实现这种类似的控制呢？
不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则就默认
年龄，必须在1-120，年龄，  工资不能直接查看，  name的长度在2-6字符之间
 */
class Person {
    public String name; //名字公开
    private int age; //age 私有化
    private double salary; //..

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}