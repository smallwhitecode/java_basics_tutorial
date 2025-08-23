package com.hspedu.enum_;
/**
* @Author:李强
* @Date:2025/3/21
* @Description:chapter11
*
*/

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
    }
}

//演示使用enum关键字来实现枚举类
enum Season2 {//类


    //定义了四个对象
    //public static final Season SPRING = new Season("春天", "温暖");
    //public static final Season WINTER = new Season("夏天", "炎热");
    //public static final Season AUTUMN = new Season("秋天", "凉爽");
    //public static final Season SUMMER = new Season("冬天", "寒冷");
    //如果使用了enum 来实现枚举类
    //1、使用关键字 enum 替代 class
    //2、public static final Season SPRING = new Season("春天", "温暖") 直接使用
    // SPRING("春天", "温暖") 解读 常量名(实参列表)
    //3、如果有多个常量(对象)， 使用，逗号隔开
    //4、如果使用enum 来实现枚举，要求将定义常量对象，写在前面
    //5、如果我们使用的是无参构造器，创建常量对象，则可以省略（）
    SPRING("春天", "温暖"),
    WINTER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    SUMMER("冬天", "寒冷"),
    /*WHAT8*/;
    private String name;
    private String desc;

    private Season2() {

    }

    //1、将构造器私有化，目的防止 直接new
    //2、去掉setXxx方法，防止属性被修改
    //3、在Season 内部，直接创建固定的对象
    //4、优化，可以加入 final 修饰符
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}