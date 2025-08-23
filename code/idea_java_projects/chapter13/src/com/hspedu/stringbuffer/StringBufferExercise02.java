package com.hspedu.stringbuffer;

/**
 * @Author:李强
 * @Date:2025/3/27
 * @Description:chapter13
 */

public class StringBufferExercise02 {
    public static void main(String[] args) {
        String price = "123456.789";
        StringBuffer sb = new StringBuffer(price);
        //int i = sb.lastIndexOf(".");
        for (int j = sb.lastIndexOf(".") - 3; j > 0; j -= 3) {
            sb.insert(j, ",");
        }
    }
}
