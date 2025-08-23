package com.hspedu.writer_;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author:李强
 * @Date:2025/6/18
 * @Description:chapter19
 */

public class FileWriter_ {
    public static void main(String[] args) {

        String filePath = "e:\\story.txt";
        //创建FileWriter 对象
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};

        try {
            fileWriter = new FileWriter(filePath);
            //1. writer(int)：写入单个字符
            fileWriter.write('H');
            //2. writer(char[])：写入指定字符
            fileWriter.write(chars);
            //3. writer(char[],off,len)：写入指定数组的指定部分
            fileWriter.write("李强写java".toCharArray(), 0, 2);
            //4. writer(String)：写入整个字符串
            fileWriter.write(" 你好python");
            //5. writer(String,off,len)：写入字符串的指定部分
            fileWriter.write("一起学java", 0, 3);
            //在数据量大的情况下，可以使用循环操作
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //对于FileWriter , 一定要关闭流，或者flush 才能真正的把数据写入到文件
            try {
                //fileWriter.flush();
                //关闭文件流，等价flush() + 关闭
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
