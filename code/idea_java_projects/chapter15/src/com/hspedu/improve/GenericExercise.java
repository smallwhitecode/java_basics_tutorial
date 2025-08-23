package com.hspedu.improve;

import java.util.*;

/**
 * @Author:李强
 * @Date:2025/4/20
 * @Description:chapter15
 */
@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {

        Student s1 = new Student("tom", 18);
        Student s2 = new Student("jack", 20);
        Student s3 = new Student("java", 25);

        HashSet<Student> set = new HashSet<Student>();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        for (Student s : set) {
            System.out.println(s);
        }

        HashMap<String, Student> map = new HashMap<String, Student>();
        map.put("tom", s1);
        map.put("jack", s2);
        map.put("java", s3);

        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
