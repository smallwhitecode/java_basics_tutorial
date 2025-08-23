package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/4/5
 * @Description:chapter13
 */

public class Homework04 {
    public static void main(String[] args) {

    }

    public static void countStr(String str) {
        if (str == null) {
            System.out.println("输出不能为空");
            return;
        }
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCount++;
            } else if (str.charAt(i) <= 'A' && str.charAt(i) >= 'Z') {
                upperCount++;
            } else {
                otherCount++;
            }
            System.out.println("");
        }
    }
}
