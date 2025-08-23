package com.hspedu.interface_;

/**
 * @Author:李强
 * @Date:2025/3/16
 * @Description:chapter10
 */

//Phone 类  实现UsbInterface
//解读1.即 Phone类需要实现 UsbInterface接口 规定/声明方法
public class Phone implements UsbInterface {

    @Override
    public void start() {
        System.out.println("手机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作...");
    }
}
