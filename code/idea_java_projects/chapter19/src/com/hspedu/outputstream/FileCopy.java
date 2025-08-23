package com.hspedu.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:李强
 * @Date:2025/6/18
 * @Description:chapter19
 */

public class FileCopy {
    public static void main(String[] args) {
        //完成 文件拷贝，将e:\\a.png 拷贝到 e:\\data
        //1、创建文件输入流，将文件读入到程序
        //2、创建文件输出流，将读取的文件数据，写入到指定的文件

        String srcFilePath = "e:\\a.png";
        String destFilePath = "e:\\data\\a.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义y一个字节数组，提高读取效果
            byte[] buf = new byte[1024];
            int readLine = 0;
            while ((readLine = fileInputStream.read(buf)) != -1) {
                //读取到后，就写入到文件 通过 fileOutputStream
                //即，是一边读，一边写
                fileOutputStream.write(buf, 0, readLine);//一定要使用这个方法
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭输入流和输出流，释放资源
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
