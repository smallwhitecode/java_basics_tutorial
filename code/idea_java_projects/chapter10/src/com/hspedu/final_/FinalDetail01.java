package com.hspedu.final_;

/**
 * @Author:李强
 * @Date:2025/3/12
 * @Description:chapter10
 */

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
    }
}

class AA {
    /*
    1.定义时：如public final double TAX_RATE = 0.08;
    2.在构造器中
    3.在代码块中
    */
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {
        TAX_RATE2 = 0.09;
    }
    {
        TAX_RATE3 = 0.10;
    }
}

//final类不能继承，但是可以实例化对象
final class CC {}