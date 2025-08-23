package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @Author:李强
 * @Date:2025/6/16
 * @Description:chapter19
 */

public class Directory {
    public static void main(String[] args) {

    }

    //判断 e:\news1.txt 文件是否存在，如果存在就删除。
    @Test
    public void m1() {
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该文件不存在");
        }
    }

    //2) 判断 /Users/jianjian/Downloads/test 目录是否存在，如果存在就提示已经存在，否则就创建。
    @Test
    public void Q2(){
        String fileName = "/Users/jianjian/Downloads/test";
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println(file.getName()+"文件存在");
        } else{
            System.out.println(file.getName()+"文件不存在");
            if (file.mkdir()) {
                System.out.println(file.getName()+"文件创建成功");
            } else{
                System.out.println(file.getName()+"文件创建失败");
            }
        }
    }

    //3) 判断 /Users/jianjian/Downloads/test/a/b  目录是否存在，如果存在就提示已经存在，否则就创建。
    @Test
    public void Q3(){
        String fileName = "/Users/jianjian/Downloads/test/a/b";
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println(file.getName()+"文件存在");
        } else{
            System.out.println(file.getName()+"文件不存在");
            if (file.mkdirs()) {
                System.out.println(file.getName()+"文件创建成功");
            } else{
                System.out.println(file.getName()+"文件创建失败");
            }
        }
    }
}
