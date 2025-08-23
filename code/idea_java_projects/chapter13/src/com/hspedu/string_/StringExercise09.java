package com.hspedu.string_;

/**
 * @Author:李强
 * @Date:2025/3/25
 * @Description:chapter13
 */

public class StringExercise09 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'H';
    }
    public static void main(String[] args) {
        StringExercise09 ex = new StringExercise09();
        ex.change(ex.str, ex.ch);
        System.out.println("str: " + ex.str);
        System.out.println("ch: " + ex.ch);


    }
}
