package com.yzf.tankgame4;


import javax.swing.*;

public class TankGame04 extends JFrame{
    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame04 tankGame01 = new TankGame04();
    }

    public TankGame04() {
        mp = new MyPanel();
        this.add(mp);//面板就是游戏的绘图区域
        Thread thread = new Thread(mp);
        thread.start();// 启动线程
        this.setSize(1000,750);//窗口大小
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
