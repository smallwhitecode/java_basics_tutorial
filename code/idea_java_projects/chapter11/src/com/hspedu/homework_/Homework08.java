package com.hspedu.homework_;

/**
 * @Author:李强
 * @Date:2025/3/23
 * @Description:chapter11
 */

public class Homework08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        switch (green) {
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            default:
                System.out.println("未匹配到任何枚举值");
        }
    }
}

interface IMyInterface {
    public void show();
}

enum Color implements IMyInterface {
    RED("255", "0", "0"),
    BLUE("0", "0", "255"),
    BLACK("0", "0", "0"),
    YELLOW("255", "255", "0"),
    GREEN("0", "255", "0"),
    ;
    private String redValue;
    private String greenValue;
    private String blueValue;

    private Color(String redValue, String greenValue, String blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值=" + redValue + "," + greenValue + "," + blueValue);
    }
}
