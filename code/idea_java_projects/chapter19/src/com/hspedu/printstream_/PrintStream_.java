package com.hspedu.printstream_;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @Author:李强
 * @Date:2025/6/27
 * @Description:chapter19
 */

public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        //输出到屏幕
        PrintStream printStream = new PrintStream(System.out);
        printStream.print("hello,你好");
        //printStream.write("hello,你好".getBytes());
        printStream.close();

        //修改打印流输出的位置/设备
        System.setOut(new PrintStream("e:\\f1.txt"));
        System.out.println("你好");
        printStream.close();

        System.out.println("bbb");
    }
}
