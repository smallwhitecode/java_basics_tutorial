package com.hspedu.innerclass;

/**
 * @Author:李强
 * @Date:2025/3/19
 * @Description:chapter10
 */

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
//接口
interface Bell {
    void ring();
}
class CellPhone {
    public void alarmClock(Bell bell) {
        bell.ring();
    }
}
