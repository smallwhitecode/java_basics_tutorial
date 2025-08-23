package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/4/2
 * @Description:chapter13
 */

public class HomeWork01 {
    public static void main(String[] args) {
        String str = "abcdef";
        String reverse = reverse(str, 1, 4);
        System.out.println(reverse);  // output: "fedcba"
    }

    public static String reverse(String str, int start, int end) {
        //对输入的参数做一个验证
        //重要的编程技巧
        //1、写出正确的情况
        //2、然后取反即可
        if (!(str != null && start > 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char tmp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }
        //使用chars重新构建一个String 返回即可
        return new String(chars);
    }
}
