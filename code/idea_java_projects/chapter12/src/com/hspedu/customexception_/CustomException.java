package com.hspedu.customexception_;

/**
 * @Author:李强
 * @Date:2025/3/24
 * @Description:chapter12
 */

public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18~120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}
