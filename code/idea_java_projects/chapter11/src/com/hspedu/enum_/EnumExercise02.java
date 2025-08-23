package com.hspedu.enum_;

/**
 * @Author:李强
 * @Date:2025/3/21
 * @Description:chapter11
 */

public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week week : values) {
            System.out.println(week);
        }
    }
}
