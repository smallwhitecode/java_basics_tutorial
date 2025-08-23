package com.hspedu.interface_;

/**
 * @Author:李强
 * @Date:2025/3/16
 * @Description:chapter10
 */

public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作...");
    }
}
