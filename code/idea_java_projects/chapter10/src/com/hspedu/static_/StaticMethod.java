package com.hspedu.static_;

/**
 * @Author:李强
 * @Date:2025/3/10
 * @Description:chapter10
 */

public class StaticMethod {
    public static void main(String[] args) {
        //创建2个学生对象，交学费
        Stu tom = new Stu("tom");
        //tom.payFee(100);
        //Stu.payFee(100);//对不对？ 对

        Stu mary = new Stu("mary");
        //mary.payFee(200);
        Stu.payFee(200);

        //输出当前收到的总学费
        Stu.showFee();
    }
}

class Stu {
    private String name;//普通成员
    //定义一个静态变量，来累积学生的学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //说明
    //1.当方法使用了Static修饰后，该方法就是静态方法
    //2.静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        Stu.fee +=fee;//累积到
    }

    public static void showFee() {
        System.out.println("总学费有：: " + fee);
    }
}