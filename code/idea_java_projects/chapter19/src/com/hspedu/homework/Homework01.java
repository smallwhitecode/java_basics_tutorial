package com.hspedu.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author:李强
 * @Date:2025/6/27
 * @Description:chapter19
 */

public class Homework01 {
    public static void main(String[] args) throws IOException {
        //(1)在判断是否有文件夹mytemp ,如果没有就创建mytemp
        //(2)在mytemp目录下，创建文件hello.txt
        //(3)如果hello.txt已经存在，提示该文件已经存在，就不要再重复创建了
        //(4)并且在hello.txt文件中，写入hello,world~

        String directoryPath = "e:\\mytemp";
        File file = new File(directoryPath);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("目录创建成功");
            } else {
                System.out.println("目录创建失败");
            }
        } else {
            System.out.println("目录已经存在");
        }
        file = new File(file, "hello.txt");
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("文件创建成功");
                BufferedWriter br = new BufferedWriter(new FileWriter(file));
                br.write("hello,world");
                br.close();
            } else {
                System.out.println("文件创建失败");
            }
        } else {
            System.out.println("文件已经存在");
        }

    }
}
