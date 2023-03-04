package yzf.threadmethod_;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();//启动子线程

        for (int i = 0; i < 5; i++) {
            System.out.println("不准吃了！！！" + i);
            Thread.sleep(1000);
        }
        t.interrupt();
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "刘芮吃包子" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "刘芮休眠中~~");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被 interrupt了");
            }
        }
    }
}