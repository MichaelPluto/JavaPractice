package com.yzf.ballmove_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{//窗口
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);//设置窗口大小
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时终止进程
        this.setVisible(true);//可视化
    }
}
class MyPanel extends JPanel implements KeyListener {//画板

    //为了能够改变 x y 的值，将x，y 设成变量
    int x = 0;
    int y = 0;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,25,25);
    }

    @Override
    //有字符输出时，该方法会触发
    public void keyTyped(KeyEvent e) {

    }

    @Override
    //有按键被按动时，该方法会触发
    public void keyPressed(KeyEvent e) {
        //根据用户按下的不同键，来处理小球的移动(上下左右的键)
        if (e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            y++;
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }
        //改变值后必须重新绘制
        this.repaint();
    }

    @Override
    //有按键被松开时，该方法会触发
    public void keyReleased(KeyEvent e) {

    }
}