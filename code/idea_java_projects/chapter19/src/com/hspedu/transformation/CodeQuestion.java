package com.hspedu.transformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author:李强
 * @Date:2025/6/27
 * @Description:chapter19
 * 看一个中文乱码问题
 */

public class CodeQuestion {
    public static void main(String[] args) throws IOException {

        String filePath = "e:\\story.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String s = br.readLine();
        System.out.println("读取到的内容：" + s);
        br.close();
    }
}
