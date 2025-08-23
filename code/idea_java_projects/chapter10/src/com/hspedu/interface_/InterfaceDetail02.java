package com.hspedu.interface_;

/**
 * @Author:李强
 * @Date:2025/3/17
 * @Description:chapter10
 */

public class InterfaceDetail02 {
    public static void main(String[] args) {
        //证明 接口中的属性，是public static final
        System.out.println(IB.n1);

    }
}

interface IB {
    //接口中的属性，只能是final的，而且是public static final 修饰符
    int n1 =10;//等价 public static final int n1 = 10；
    void hi();
}
interface IC {
    void say();
}

class Pig implements IB,IC {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}