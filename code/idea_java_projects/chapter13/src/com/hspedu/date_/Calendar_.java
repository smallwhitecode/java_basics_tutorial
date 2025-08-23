package com.hspedu.date_;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Author:李强
 * @Date:2025/4/1
 * @Description:chapter13
 */

public class Calendar_ {
    public static void main(String[] args) {
        //Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        //为什么要+1，因为calendar 返回月时候，是按照0开始编号
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        //SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = simpleDateFormat.format(calendar.getTime());
        System.out.println(date);

        //Date
        Date date1 = new Date();
        System.out.println(date1);

        //TimeZone
        TimeZone timeZone = TimeZone.getDefault();
    }
}
