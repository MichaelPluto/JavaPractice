package yzf.threadmethod_;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        t1.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"hello" + i);
            Thread.sleep(1000);
            if (i == 5){
                //线程插队 yield 不一定成功
                //Thread.yield();
                t1.join();
            }
        }


    }
}

class T1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "hello" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}