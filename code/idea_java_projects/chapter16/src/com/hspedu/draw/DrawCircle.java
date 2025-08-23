package com.hspedu.draw;

import com.hspedu.tankgame.MyPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @Author:李强
 * @Date:2025/4/27
 * @Description:chapter16 演示如何在面板上画出图形
 */

public class DrawCircle extends JFrame {

    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(mp);
        //设置窗口的大小
        this.setSize(400, 300);
        //点击窗口的小x，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

//1、先定义一个MyPanel，继承JPanel类，画图形，
class MyPanel01 extends JPanel {

    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法完成初始化
        //画出一个圆形
        g.drawOval(10, 10, 100, 100);

        //演示
        //画直线
        g.drawLine(10, 10, 100, 100);
        //画矩形边框
        g.drawRect(10, 10, 100, 100);
        //画椭圆边框
        g.drawOval(10, 10, 50, 100);
        //填充矩形
        g.setColor(Color.blue);
        g.fillRect(10, 10, 100, 100);
        //填充椭圆
        g.setColor(Color.red);
        g.fillOval(10, 10, 100, 100);
        //画图片
        //1、获取图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/pg.jpg"));
        g.drawImage(image, 10, 10, 1920, 1080, this);
        //画字符串
        g.setColor(Color.red);
        g.setFont(new Font("隶书", Font.BOLD, 50));
        g.drawString("北京你好", 100, 100);
        //设置画笔的字体  setFont(Font font)
        //设置画笔的颜色  setColor(Color c)
    }
}
