package com.hspedu.tankgame2;

import javax.swing.*;

/**
 * @Author:李强
 * @Date:2025/4/27
 * @Description:chapter16
 */

public class TankGame02 extends JFrame {

    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame02 tankGame02 = new TankGame02();
    }

    public TankGame02() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}
