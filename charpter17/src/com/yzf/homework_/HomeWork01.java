package com.yzf.homework_;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B();
        b.start();

    }
}
class A extends Thread {
    private static boolean loop = true;
    public static void setLoop(boolean loop) {
        A.loop = loop;
    }

    @Override
    public  void run() {
        while (loop){
            System.out.println((int) (Math.random()*100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class B extends Thread {
    Scanner scanner = new Scanner(System.in);
    public void run(){
        while (true) {
            System.out.println("请输入:");
            String key = scanner.next().toUpperCase();
            System.out.println("");
            if (key.equals("Q")) {
                A.setLoop(false);
                System.out.println("A进程结束");
                break;
            }
        }
    }
}
