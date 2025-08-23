package com.hspedu.improve;

import java.util.ArrayList;

/**
 * @Author:李强
 * @Date:2025/4/21
 * @Description:chapter15
 */

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack", 10000, new MyDate(2025, 04, 21)));
        employees.add(new Employee("tom", 20000, new MyDate(2024, 04, 21)));
        employees.add(new Employee("tom", 18000, new MyDate(2023, 04, 21)));

        System.out.println("employees=" + employees);

        //排序
        employees.sort((o1, o2) -> {
            if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                System.out.println("类型不正确");
                return 0;
            }
            int compare = o1.getName().compareTo(o2.getName());
            if (compare != 0) {
                return compare;
            }
            return o1.getBirthday().compareTo(o2.getBirthday());
        });
        System.out.println("employees=" + employees);
    }
}
