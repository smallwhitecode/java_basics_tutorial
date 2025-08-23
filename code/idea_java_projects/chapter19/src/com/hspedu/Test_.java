package com.hspedu;

/**
 * @Author:李强
 * @Date:2025/6/20
 * @Description:chapter19
 */

public class Test_ {
    public static void main(String[] args) {

        BufferedReader_ bufferedReader = new BufferedReader_(new FileReader_());
        bufferedReader.readFiles(10);

        //这次希望通过 BufferedReader_ 多次读取字符串
        BufferedReader_ bufferedReader1 = new BufferedReader_(new StringReader_());
        bufferedReader1.readStrings(5);
    }
}
