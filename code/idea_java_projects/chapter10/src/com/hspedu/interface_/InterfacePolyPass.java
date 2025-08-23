package com.hspedu.interface_;

/**
 * @Author:李强
 * @Date:2025/3/17
 * @Description:chapter10
 */

public class InterfacePolyPass {
    public static void main(String[] args) {

        //接口类型的变量可以指向，实现了该接口的类的对象实例
        IG ig = new Teacher();
        IH ih = new Teacher();
    }
}

interface IH {
}
interface IG extends IH {
}
class Teacher implements IG {

}
