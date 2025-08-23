package com.hspedu.tankgame3;

import javax.swing.*;

/**
 * @Author:李强
 * @Date:2025/4/27
 * @Description:chapter16
 */

public class TankGame03 extends JFrame {

    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame03 tankGame02 = new TankGame03();
    }

    public TankGame03() {
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}
