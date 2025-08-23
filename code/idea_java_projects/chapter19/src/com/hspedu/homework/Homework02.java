package com.hspedu.homework;

import java.io.*;

/**
 * @Author:李强
 * @Date:2025/6/27
 * @Description:chapter19
 */

public class Homework02 {
    public static void main(String[] args) {
        /**
         * 使用 BufferedReader 读取一个文本文件，为每行加上行号，再连同内容一并输出到屏幕上。
         *
         * 如果把文件的编码改成了gbk ,出现中文乱码，如何解决？
         * 1.默认是按照utf-8处理，开始没有乱码
         * 2.提示:使用转换流，将FilelnputStream -> InputStreamReader[指定编码] -> BufferedReader
         */
        String filePath = "e:\\news1.txt";
        String data;
        int line = 0;
        BufferedReader br = null;
        //BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            //bw = new BufferedWriter(new FileWriter(filePath));
            while ((data = br.readLine()) != null) {
                System.out.println(++line + data);
                //bw.write(++line + data);
            }
            System.out.println("===============编码更改后==================");

            //把 FileInputStream 转换成 InputStreamReader 指定编码gbk
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath),"gbk");
            //把 InputStreamReader 传入到BufferedReader
            br = new BufferedReader(inputStreamReader);
            while ((data = br.readLine()) != null) {
                System.out.println(++line + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                //if (bw != null) {
                //    bw.close();
                //}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
