package com.hspedu.exception_;

/**
 * @Author:李强
 * @Date:2025/3/23
 * @Description:chapter12
 */

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //1、num1 / num2 => 10/0
        //2、当执行到 num1 / num2 因为 num2 = 0，程序就会出现(抛出)异常 ArithmeticException
        //3、当抛出异常后，程序就退出
        //int res = num1 / num2;
        //如果程序员，认为一段代码可能出现异常/问题，可以使用try-catch异常处理机制来解决

        try {
            int res = num1 / num2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("程序继续运行....");
    }
}
