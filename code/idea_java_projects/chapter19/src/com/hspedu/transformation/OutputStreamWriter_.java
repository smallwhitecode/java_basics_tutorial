package com.hspedu.transformation;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author:李强
 * @Date:2025/6/27
 * @Description:chapter19
 */

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        // 1.创建流对象
        String charset = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:\\story.txt"), charset);
        BufferedWriter bw = new BufferedWriter(osw);
        // 2.写入
        bw.write("hello1,你好呀~");
        //osw.write("hello,你好呀~");
        // 3.关闭
        bw.close();
        System.out.println("保存成功~");
    }
}
