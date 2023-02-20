package com.yzf.tankgame4;

import java.util.Vector;

@SuppressWarnings({"all"})
public class EnemyTank extends Tank implements Runnable {
    boolean move = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    Vector<Shot> shots = new Vector<>();// 使用Vector 保存多个Shot

    @Override
    //在创建敌方坦克位置启动线程
    public void run() {
        //因为要求敌人坦克可以自由移动，所以需要将敌方坦克当成一个线程使用
        while (true) {

            //如果 shots.size == 0
            //创建一颗子弹放入集合中，并启动
            if (isLive && shots.size() < 1) {
                Shot shot = null;
                //判断坦克方向，创建对应子弹
                switch (getDirection()) {
                    case 0:
                        shot = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        shot = new Shot(getX() + 20, getY() + 60, 1);
                        break;
                    case 2:
                        shot = new Shot(getX(), getY() + 20, 2);
                        break;
                    case 3:
                        shot = new Shot(getX() + 60, getY() + 20, 3);
                        break;
                }
                    shots.add(shot);
                    new Thread(shot).start();
            }

            //根据坦克方向来继续移动
            switch (getDirection()) {
                case 0://上
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1://下
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2://左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3://右
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //然后随机设置方向
            setDirection((int) (Math.random() * 4));

            //当敌方坦克被击中时，需要将线程结束
            if (!(isLive)) {
                break;
            }
        }
    }

}
