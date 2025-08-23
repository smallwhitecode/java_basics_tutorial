package com.hspedu.writer_;

import java.io.*;

/**
 * @Author:李强
 * @Date:2025/6/26
 * @Description:chapter19
 */

public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "e:\\hello.txt";
        String destFilePath = "e:\\data\\hello.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String data = null;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            //说明: readLine 读取一行内容，但是没有换行
            while ((data = br.readLine()) != null) {
                //每读取一行，就写入
                bw.write(data);
                //插入一个换行
                bw.newLine();
            }
            System.out.println("拷贝完毕......");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭流
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
