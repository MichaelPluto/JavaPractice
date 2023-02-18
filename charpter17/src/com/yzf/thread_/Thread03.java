package com.yzf.thread_;

public class Thread03 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread thr1 = new Thread(thread1);
        thr1.start();
        Thread thr2 = new Thread(thread2);
        thr2.start();
    }
}
class Thread1 implements Runnable{
    int count = 1;
    @Override
    public void run() {
        while (true) {
            System.out.println("hello,world" + " " + count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10){
                break;
            }
        }
    }
}
class Thread2 implements Runnable{
    int count = 1;
    @Override
    public void run() {
        while (true){
            System.out.println("hi"+ " " + count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 5){
                break;
            }
        }
    }
}