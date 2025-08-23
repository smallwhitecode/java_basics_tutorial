package com.hspedu.homework_;

/**
 * @Author:李强
 * @Date:2025/3/23
 * @Description:chapter11
 */

public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹冷风");
            } else if (temperature >= 0) {
                System.out.println("吹暖风");
            } else {
                System.out.println("不开空调");
            }
        }
    }
    //返回一个Air对象
    public Air getAir() {
        return new Air();
    }
}
