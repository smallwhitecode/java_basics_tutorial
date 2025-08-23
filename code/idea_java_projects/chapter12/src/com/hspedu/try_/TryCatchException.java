package com.hspedu.try_;

import java.util.Scanner;

/**
 * @Author:李强
 * @Date:2025/3/23
 * @Description:chapter12
 */

public class TryCatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {
            System.out.println("请输入一个整数：");
            inputStr = scanner.next();
            try {
                Integer.parseInt(inputStr);//这里可能抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数：");
            }
        }
        System.out.println("你输入的值是=" + num);
    }
}
