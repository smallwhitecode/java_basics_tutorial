package com.hspedu.improve;

/**
 * @Author:李强
 * @Date:2025/4/21
 * @Description:chapter15
 */

public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;


    public MyDate(int year, int month, int day) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) { //把对year-month-day比较放在这里
        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        int monthMinus = month - o.getYear();
        if (monthMinus != 0) {
            return monthMinus;
        }
        return day - o.getDay();
    }
}
