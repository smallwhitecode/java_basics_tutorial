package com.hspedu.qqframe;

import com.hspedu.qqserver.service.QQServer;

/**
 * @Author:李强
 * @Date:2025/8/6
 * @Description:QQServer
 * 该类创建QQServer，启动后台服务
 */

public class QQFrame {
    public static void main(String[] args) {
        new QQServer();
    }
}
