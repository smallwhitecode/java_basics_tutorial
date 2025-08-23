package com.hspedu;

/**
 * @Author:李强
 * @Date:2025/8/17
 * @Description:chapter23
 */

public class Car {
    public String brand = "宝马";
    public int price = 5000000;
    public String color = "白色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
