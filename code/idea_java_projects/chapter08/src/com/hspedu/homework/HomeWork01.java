package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/1/8
 * @Description:chapter08
 */

public class HomeWork01 {

    public static void main(String[] args) {
        Person person[] = {new Person("tom", 21, "it"),
                new Person("jack", 19, "网红"),
                new Person("jerry", 20, "明星")};

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

        for (int i = 0; i < person.length - 1; i++) {
            Person tmp = null;
            for (int j = i + 1; j < person.length; j++) {
                if (person[i].getAge() < person[i + 1].getAge()) {
                    tmp = person[i];
                    person[i] = person[i + 1];
                    person[i + 1] = tmp;
                }
            }
        }
        System.out.println("排序后的效果");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }

}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
