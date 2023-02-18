package com.yzf.threadmethod_;

public class ThreadExercise {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        Thread thread = new Thread(t2);
        //主线程
        for (int i = 1; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + " "+ "hello" + " " +i);
            Thread.sleep(1000);
            if (i == 5){
                thread.start();
                thread.join();
            }
            System.out.println("主线程结束");
        }
    }
}
class T2 implements Runnable{
    @Override
    //子线程
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + "hello" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程结束");
        }
    }
}