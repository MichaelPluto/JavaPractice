package com.yzf.tankgame_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//坦克大战的绘图区域
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);//初始化坦克
        hero.setSpeed(4);
    }

    @Override
    public void paint(Graphics g) {
        //在此区域绘制坦克
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//默认黑色
        //将绘制坦克封装成一个方法，再调用即可
        //drawTank(hero.getX(), hero.getY(), g, 0, 0);
        drawTank(hero.getX() + 60, hero.getY(), g, 1, hero.getDirection());

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
            case 3: //表示向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;
            case 2: //表示向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
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
        //改变值后必须重新绘制
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
