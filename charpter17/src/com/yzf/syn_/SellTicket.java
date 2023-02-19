package com.yzf.syn_;
public class SellTicket {

    public static void main(String[] args) {
        //使用继承Thread
//        SellTicket01 ticket01 = new SellTicket01();
//        SellTicket01 ticket02 = new SellTicket01();
//        SellTicket01 ticket03 = new SellTicket01();
//        ticket01.start();
//        ticket02.start();
//        ticket03.start();
        //使用 实现 Runnable接口
        SellTicket03 ticket03 = new SellTicket03();
        new Thread(ticket03).start();
        new Thread(ticket03).start();
        new Thread(ticket03).start();


    }
}

class SellTicket03 implements Runnable {
    private static int num = 100;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }

    public /*synchronized*/  void sell() {//同步方法
        synchronized (this) {
            if (num <= 0) {
                System.out.println("售票结束");
                loop = false;
                return;
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " " + "售出一张票" + "剩余=" +
                    (--num) + "张票");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
@SuppressWarnings({"all"})
//使用继承Thread的 方法
class SellTicket01 extends Thread {
    private static int num = 100;

    @Override
    public void run() {
        while (true) {
            System.out.println("窗口" + Thread.currentThread().getName() + " " + "售出一张票" + "剩余=" +
                    (--num) + "张票");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num <= 0) {
                break;
            }
            System.out.println("售票结束");
        }
    }
}
@SuppressWarnings({"all"})
//使用实现 Runnable 的方式
class SellTicket02 implements Runnable {
    private int num = 100;

    @Override
    public void run() {
        while (true) {
            System.out.println("窗口" + Thread.currentThread().getName() + " " + "售出一张票" + "剩余=" +
                    (--num) + "张票");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num <= 0) {
                break;
            }
            System.out.println("售票结束");
        }
    }
}