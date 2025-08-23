package com.hspedu.wrapper;

/**
 * @Author:李强
 * @Date:2025/3/24
 * @Description:chapter13
 */

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer)->String
        Integer i = 100;//自动装箱
        //方式1
        String str1 = i + "";
        //方式2
        String str2 = i.toString();
        String str3 = String.valueOf(i);

        //String -> 包装类(Integer)
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4); //使用自动装箱
        Integer i3 = new Integer(str4); //使用new Integer()
    }
}
