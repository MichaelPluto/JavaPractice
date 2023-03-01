package com.yzf.tankgame6;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class TankGame06 extends JFrame{
    //定义MyPanel
    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TankGame06 tankGame01 = new TankGame06();
    }

    public TankGame06() {
        System.out.println("请输入选择 1: 新游戏 2: 继续游戏");
        String key = scanner.next();
        mp = new MyPanel(key);
        Thread thread = new Thread(mp);
        thread.start();// 启动线程
        this.add(mp);//面板就是游戏的绘图区域
        this.setSize(1300,950);//窗口大小
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //在JFrame中 增加相应关 闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.saveAllEnemyTankNum();

                System.exit(0);
            }
        });
    }
}
