package com.hspedu.homework_;

/**
 * @Author:李强
 * @Date:2025/3/24
 * @Description:chapter12
 */

public class Homework01 {
    public static void main(String[] args) {

        try {
            //先验证输入的参数的个数是否正确 两个参数
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            //先把j接收到的参数，转换成整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输出整数");
        } catch (ArithmeticException e) {
            System.out.println("出现除0");
        }


    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
