package com.yzf.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{
    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(mp);
        //设置窗口大小
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可视化
    }
}
//先定义一个MyPanel,继承JPanel类，画图就在该面板上画
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);//调用父类方法完成初始化
        System.out.println("pain方法被调用");
        //画一个圆
        //g.drawOval(10,10,100,100);

        //演示绘制不同的图形..
        // 画直线 drawLine(int x1,int y1,int x2,int y2)
          g.drawLine(10,10,100,100);
        //画矩形边框 drawRect(int x, int y, int width, int height)
          //g.drawRect(100,100,100,100);
        //画椭圆边框 drawOval(int x, int y, int width, int height)

        //填充矩形 fillRect(int x, int y, int width, int height)
        //设置画笔的颜色
           g.setColor(Color.PINK);
           g.fill3DRect(100,100,100,100,true);
        //填充椭圆 fillOval(int x, int y, int width, int height)
           g.setColor(Color.GRAY);
           g.fillOval(20,20,50,50);
        //画图片 drawImage(Image img, int x, int y, ..)
        //1. 获取图片资源, /bg.png 表示在该项目的根目录去获取 bg.png 图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/pn.png"));
        g.drawImage(image,10,10,273,364,this);
        // g.drawImage(image, 10, 10, 175, 221, this);
        //画字符串 drawString(String str, int x, int y)//写字
        //给画笔设置颜色和字体
        //这里设置的 100， 100， 是 "北京你好"左下角
        //设置画笔的字体 setFont(Font font)
        //设置画笔的颜色 setColor(Color c)
        g.setColor(Color.RED);
        g.setFont(new Font("正楷",Font.BOLD,30));
        g.drawString("ありがど",80,100);
    }
}