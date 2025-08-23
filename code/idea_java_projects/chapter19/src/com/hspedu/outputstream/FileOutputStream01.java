package com.hspedu.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:李强
 * @Date:2025/6/18
 * @Description:chapter19
 */

public class FileOutputStream01 {
    public static void main(String[] args) {

    }


    /**
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void writeFile() {
        String filePath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //得到 FileOutputStream对象
            fileOutputStream = new FileOutputStream(filePath);

            //new FileOutputStream(filePath, true);
            //写入一个字节
            //fileOutputStream.write('a');
            //写入字符串
            String str = "hello,world!";
            //str.getBytes() 可以把 字符串 -> 字节数组
            //fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(), 0, 3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
