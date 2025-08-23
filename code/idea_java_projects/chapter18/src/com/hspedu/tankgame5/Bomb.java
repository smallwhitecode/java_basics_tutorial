package com.hspedu.tankgame5;

/**
 * @Author:李强
 * @Date:2025/6/10
 * @Description:chapter18
 *
 * 炸弹
 */

public class Bomb {
    int x, y;//炸弹
    int life = 20;//炸弹的生命周期
    boolean isLive = true;//是否还存活

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //减少生命值
    public void lifeDown() {
        if (life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }
}
