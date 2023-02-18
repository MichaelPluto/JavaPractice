package com.yzf.threadmethod_;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);//设置为守护线程
        myDaemonThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("宝强在辛苦的工作" + i);
            Thread.sleep(1000);
        }
    }
}
class MyDaemonThread extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println("马蓉和宋喆快乐的聊天");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}