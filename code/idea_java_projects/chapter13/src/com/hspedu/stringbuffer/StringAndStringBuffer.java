package com.hspedu.stringbuffer;

/**
 * @Author:李强
 * @Date:2025/3/26
 * @Description:chapter13
 */

public class StringAndStringBuffer {
    public static void main(String[] args) {
        //看String ->StringBuffer
        String str = "hello";
        //方式一：使用构造器
        //注意：返回的才是StringBuffer对象，对str 本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(str);
         
    }
}
