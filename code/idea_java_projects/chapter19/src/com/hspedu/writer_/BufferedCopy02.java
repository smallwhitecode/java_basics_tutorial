package com.hspedu.writer_;

import java.io.*;

/**
 * @Author:李强
 * @Date:2025/6/26
 * @Description:chapter19
 */

public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcFilePath = "e:\\hello.txt";
        String destFilePath = "e:\\data\\hello.txt";
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        int data;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环的读取文件，并写入到 destFilePath
            byte[] buf = new byte[1024];
            int readLine = 0;
            //当返回-1时，就表示文件读取完毕
            while ((readLine = bufferedInputStream.read(buf)) != -1) {
                //System.out.print(new String(buf, 0, readLine));
                bufferedOutputStream.write(buf, 0, readLine);
            }
            System.out.println("文件拷贝完毕....");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭流
                if (bufferedInputStream != null){
                    bufferedInputStream.close();
                }
                if (bufferedOutputStream != null){
                    bufferedOutputStream.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
