package com.hspedu.poly_.polyarr_;

/**
 * @Author:李强
 * @Date:2025/1/5
 * @Description:chapter08
 */

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + "score=" + score;
    }

    //特有的方法
    public void study() {
        System.out.println("学生" + getName() + "正在学Java课程");
    }
}
