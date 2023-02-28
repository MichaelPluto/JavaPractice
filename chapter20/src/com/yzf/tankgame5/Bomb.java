package com.yzf.tankgame5;

public class Bomb {
    int x;//炸弹坐标
    int y;
    int life = 9;//炸弹的生命周期
    boolean isLive = true;//炸弹是否存活

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void lifeDown(){// 配合图片出现的爆炸效果
        if (life > 0){
            life --;
        }else {
            isLive = false;
        }
    }
}
