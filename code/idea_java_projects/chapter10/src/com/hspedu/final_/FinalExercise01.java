package com.hspedu.final_;

/**
 * @Author:李强
 * @Date:2025/3/12
 * @Description:chapter10
 */

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
    }
}

class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
