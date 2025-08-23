package com.hspedu.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @Author:李强
 * @Date:2025/4/27
 * @Description:chapter16
 */

public class TankGame01 extends JFrame {

    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }

    public TankGame01() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}
