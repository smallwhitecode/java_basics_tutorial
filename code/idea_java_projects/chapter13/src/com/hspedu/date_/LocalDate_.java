package com.hspedu.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author:李强
 * @Date:2025/4/1
 * @Description:chapter13
 */

public class LocalDate_ {
    public static void main(String[] args) {
        //第三代日期
        //1、使用now() 返回表示当前日期时间的 对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //2、使用DateTimeFormatter 对象来进行格式化
        // 创建 DateTimeFormatter对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss");
        String format = dtf.format(ldt);
    }
}
