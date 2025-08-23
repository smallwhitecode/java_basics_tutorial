package com.hspedu.innerclass;

/**
 * @Author:李强
 * @Date:2025/3/19
 * @Description:chapter10
 */

public class InnerClassExercise01 {
    public static void main(String[] args) {
        
        //当作实参直接传递，简洁高效
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅画");
            }
        });
        //传统方法
        f1(new Picuter());
    }

    //静态方法，形参是接口类型
    public static void f1(IL il) {
        il.show();
    }
}

//接口
interface IL {
    void show();
}
//类->实现IL  => 编程领域（硬编码）
class Picuter implements IL {

    @Override
    public void show() {
        System.out.println("这是一幅名画");
    }
}