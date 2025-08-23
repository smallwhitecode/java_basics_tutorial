package com.hspedu.interface_;

/**
 * @Author:李强
 * @Date:2025/3/16
 * @Description:chapter10
 */

public class Computer {
    //编写一个方法，计算机工作
    //解读：
    // 1. UsbInterface usbInterface 形参是接口类型 UsbInterface
    // 2. 看到 接收 实现了 UsbInterface接口的类的对象实例
    public void work(UsbInterface usbInterface) {
        //通过接口，来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
