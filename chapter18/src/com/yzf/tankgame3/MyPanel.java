package com.yzf.tankgame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//坦克大战的绘图区域
@SuppressWarnings({"all"})
public class MyPanel extends JPanel implements KeyListener,Runnable{
    //定义我的坦克
    Hero hero = null;
    //定义敌方坦克,因为敌方坦克数量不确定，所以将其放入一个集合中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemySize = 3;
    public MyPanel() {// 构造器
        hero = new Hero(100, 100);//初始化坦克
        hero.setSpeed(4);

        //初始化敌方坦克，循环加入敌方坦克入集合中
        for (int i = 0; i < enemySize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);// 在面板中初始化敌方坦克，并确定位置
            enemyTank.setDirection(2);
            enemyTanks.add(enemyTank);
            enemyTank.setDirection(1);
            //每当创建一个坦克对象，就给该对象初始化一个Shot对象，并存入Verctor中
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirection());
            enemyTank.shots.add(shot);//存入集合中
            new Thread(shot).start();// 启动子弹线程
        }
    }

    @Override
    public void paint(Graphics g) {
        //在此区域绘制坦克
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//默认黑色
        //将绘制坦克封装成一个方法，再调用即可
        //drawTank(hero.getX(), hero.getY(), g, 0, hero.getDirection());
        drawTank(hero.getX(), hero.getY(), g, 0, hero.getDirection());
        //绘制敌方坦克，遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //enemyTank.setDirection(1);
            drawTank(enemyTank.getX(), enemyTank.getY(),g,1,enemyTank.getDirection());
            //遍历敌方坦克对象时，绘制所有的子弹，当子弹 isLive == false 时，就从Vector中移除
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出子弹
                Shot shot = enemyTank.shots.get(j);
                //绘制
                if (!(shot.isLive())){
                    enemyTank.shots.remove(j);
                }
                g.setColor(Color.cyan);
                g.fill3DRect(shot.x, shot.y, 3,3,false);
            }
        }

        //绘制子弹
        if (hero.shot != null && hero.shot.isLive() != false){
            g.setColor(Color.PINK);
            g.fill3DRect(hero.shot.x, hero.shot.y, 3,3,false);

        }

    }

    //画出坦克-封装方法
    public void drawTank(int x, int y, Graphics g, int type, int direction) {

        switch (type) {
            case 0://自己的坦克
                //改变画笔的颜色，用于区分敌我坦克
                g.setColor(Color.PINK);
                break;
            case 1://敌人的坦克
                g.setColor(Color.cyan);
                break;
            default:
                System.out.println("输入错误");
        }
        switch (direction) {
            case 0://方向向上
                g.fill3DRect(x, y, 10, 60, false);//左轮
                g.fill3DRect(x + 30, y, 10, 60, false);//右轮
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//主体
                g.fillOval(x + 10, y + 20, 20, 20);//盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//炮筒

                break;
            case 1: //表示向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 2: //表示向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
                break;
            case 3: //表示向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;

            default:
                System.out.println("暂时不处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        for (int i = 0; i < enemyTanks.size(); i++) {
//            EnemyTank enemyTank = enemyTanks.get(i);
//            if (e.getKeyCode() == KeyEvent.VK_S){
//                enemyTank.setDirection(1);
//                enemyTank.moveDown();
//            }else if (e.getKeyCode() == KeyEvent.VK_W){
//                enemyTank.setDirection(0);
//                enemyTank.moveUp();
//            }else if (e.getKeyCode() == KeyEvent.VK_A){
//                enemyTank.setDirection(2);
//                enemyTank.moveLeft();
//            }else if (e.getKeyCode() == KeyEvent.VK_D){
//                enemyTank.setDirection(3);
//                enemyTank.moveRight();
//            }
//
//        }
        //为了方便移动坦克,将坐标 x y 变换封装成方法move()

        //根据用户按下的不同键，来处理坦克的移动(上下左右的键)
        if (e.getKeyCode() == KeyEvent.VK_W){
            hero.setDirection(0);
            hero.moveUp();
        }else if (e.getKeyCode() == KeyEvent.VK_S){
            hero.setDirection(1);
            hero.moveDown();
        }else if (e.getKeyCode() == KeyEvent.VK_A){
            hero.setDirection(2);
            hero.moveLeft();
        }else if (e.getKeyCode() == KeyEvent.VK_D){
            hero.setDirection(3);
            hero.moveRight();
        }
        if (e.getKeyCode() == KeyEvent.VK_J){
            hero.fire();
        }

        //改变值后必须重新绘制
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    //将重绘子弹作为线程单独运行，每隔 100毫秒，重绘区域
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
        }
    }
}
