package com.yzf.tankgame4;


import java.util.Vector;

public class Hero extends Tank {
    boolean move = true;

    public Hero(int x, int y) {
        super(x, y);
    }

    //Hero 有子弹的对象 控制子弹发射行为在此
    //定义一个Shot对象
    Shot shot = null;
    //创建一个Vector储存子弹
    Vector<Shot> shots = new Vector<>();

    //开火
    public void fire() {
        //创建Shot对象与坦克的方向有关系

        if (shots.size() == 10){
            return;
        }
            switch (getDirection()) {//得到Hero的方向
                case 0://向上
                    shot = new Shot(getX() + 20, getY(), 0);

                    break;
                case 1://向下
                    shot = new Shot(getX() + 20, getY() + 60, 1);

                    break;
                case 2://向左
                    shot = new Shot(getX(), getY() + 20, 2);

                    break;
                case 3://向右
                    shot = new Shot(getX() + 60, getY() + 20, 3);

                    break;
            }
        //将创建好的shot对象加入到Vector中
        shots.add(shot);
        //启动Shot线程
        new Thread(shot).start();
    }


}


