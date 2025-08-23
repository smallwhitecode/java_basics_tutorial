package com.hspedu.homework_;

/**
 * @Author:李强
 * @Date:2025/3/22
 * @Description:chapter11
 */

public class Homework02 {
    public static void main(String[] args) {
    }
}

class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        serialNumber = getCurrentNum();
    }

    public static int getCurrentNum() {
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}

class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getCurrentNum());
        System.out.println(Frock.getCurrentNum());
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}
