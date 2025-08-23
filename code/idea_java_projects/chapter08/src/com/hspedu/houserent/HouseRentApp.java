package com.hspedu.houserent;

import com.hspedu.houserent.view.HouseView;

/**
 * @Author:李强
 * @Date:2025/3/2
 * @Description:chapter08
 */

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并且显示主菜单，是整个程序的入口
        new HouseView().mainMenu();
        System.out.println("===你退出房屋出租系统===");
    }
}
