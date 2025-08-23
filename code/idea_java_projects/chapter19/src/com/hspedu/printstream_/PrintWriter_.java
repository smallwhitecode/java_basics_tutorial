package com.hspedu.printstream_;

import java.io.PrintWriter;

/**
 * @Author:李强
 * @Date:2025/6/27
 * @Description:chapter19
 */

public class PrintWriter_ {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.print("hello,你好");
        printWriter.close();

    }
}
