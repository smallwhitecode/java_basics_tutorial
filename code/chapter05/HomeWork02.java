

public class HomeWork02{

    public static void main(String[] args) {

        // 某人有100000元，每经过一次路口，需要交费，规则如下：
        //  1、当现金>50000时，每次交5%
        //  2、当现金<=50000时，每次交1000
        //  编程计算该人可以经过多少次路口，要求：使用while break使用


        double money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
                money -= money * 0.05;
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            } else {
                break;  // 跳出循环，结束交费
            }
        }
        System.out.println(count);
    }
}