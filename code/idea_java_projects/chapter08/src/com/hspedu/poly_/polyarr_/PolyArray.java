package com.hspedu.poly_.polyarr_;

/**
 * @Author:李强
 * @Date:2025/1/5
 * @Description:chapter08
 */

public class PolyArray {
    public static void main(String[] args) {
        //应用实例：现有一个继承结构如下：要求创建1个Person对象、
        //2个Student对象 和2个Teacher对象，统一放在数组中，并调用每个对象的say方法
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("mary", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);

        //循环遍历多态数组，调用say
        for (int i = 0; i < persons.length; i++) {
            //提示：persons[i] 编译类型是 Person，运行类型是根据实际情况由JVM来判断
            System.out.println(persons[i].say());//动态绑定机制
            //使用类型判断+向下转型
            if (persons[i] instanceof Student) {//判断Persons[i]的运行类型是不是Student
                //((Student) persons[i]).study();
                Student student = (Student) persons[i];//向下转型
                student.study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {
                //System.out.println("你的类型有误，清自己检查...");
            } else {
                System.out.println("你的类型有误，清自己检查...");
            }
        }
    }
}
