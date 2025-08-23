package com.hspedu.standard;

import java.util.Scanner;

/**
 * @Author:李强
 * @Date:2025/6/27
 * @Description:chapter19
 */

public class InputAndOutput {
    public static void main(String[] args) {
        //1、源码：public final static InputStream in = null;
        //2、System.in  编译类型  InputStream
        //3、System.in  运行类型  BufferedInputStream
        //4、表示标准输入  键盘
        System.out.println(System.in.getClass());
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容");
        String next = scanner.next();
        System.out.println("next=" + next);
        //1、System.out  public final static PrintStream out = null;
        //2、编译类型 PrintStream
        //3、运行类型 PrintStream
        //4、表示标准输出 显示器
        System.out.println(System.out.getClass());
    }
}
