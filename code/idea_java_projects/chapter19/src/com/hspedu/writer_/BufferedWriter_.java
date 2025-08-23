package com.hspedu.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @Author:李强
 * @Date:2025/6/26
 * @Description:chapter19
 */

public class BufferedWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "e:\\ok.txt";
        //创建BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello, 李强!");
        bufferedWriter.newLine();//插入一个和系统相关得换行
        bufferedWriter.write("hello1, 李强!");
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
