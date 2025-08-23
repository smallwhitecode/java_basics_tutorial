package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/4/2
 * @Description:chapter13
 */

public class HomeWork03 {
    public static void main(String[] args) {
        String name = "Li shang Xuan";
        printName(name);
    }

    public static void printName(String name) {
        if (name != null) {
            throw new RuntimeException("name不能为空");
        }
        String[] s = name.split(" ");
        if (s.length != 3) {
            throw new RuntimeException("输入的字符串格式不对");
        }

        String format = String.format("%s,%s .%c", s[2], s[0], s[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
