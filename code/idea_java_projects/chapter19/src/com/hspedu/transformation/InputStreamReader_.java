package com.hspedu.transformation;

import java.io.*;

/**
 * @Author:李强
 * @Date:2025/6/27
 * @Description:chapter19
 */

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\story.txt";
        //1、把 FileInputStream 转成 InputStreamReader，指定编码 gbk
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        //2、把 InputStreamReader 传入 BufferedReader
        BufferedReader br = new BufferedReader(isr);
        //将1和2合在一起
        //BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        //3、读取
        String s = br.readLine();
        System.out.println("读取内容=" + s);
        br.close();
    }
}
