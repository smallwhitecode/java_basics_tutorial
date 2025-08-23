package com.hspedu;

/**
 * @Author:李强
 * @Date:2025/5/7
 * @Description:chapter17
 */

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cpu数量/核心数
        int i = runtime.availableProcessors();
    }
}
