package com.yzf.thread_;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        for (int i = 0; i < 60; i++) {
            System.out.println(Thread.currentThread().getName() +"=" + "i =" + i);
            Thread.sleep(1000);
        }
    }
}
//编写一个类 继承 Thread 实现每隔一秒钟输出 小猫喵喵叫
class Cat extends Thread{
    //重写run方法，然后添加自己的代码逻辑

    @Override
    public void run() {
        int times = 0;
        while (true) {
            try {
                System.out.println("小猫喵喵叫" + (++times));
                Thread.sleep(1000);//休眠一秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80){
                break;
            }
        }
    }
}
