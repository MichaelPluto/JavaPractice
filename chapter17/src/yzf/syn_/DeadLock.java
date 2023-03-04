package yzf.syn_;

public class DeadLock {
    public static void main(String[] args) {
        DeadLockDemo lockDemo1 = new DeadLockDemo(true);
        DeadLockDemo lockDemo2 = new DeadLockDemo(false);
        lockDemo1.start();
        lockDemo2.start();
    }
}

class DeadLockDemo extends Thread {
    static Object o1 = new Object();// 报这个多线程共享一个对象，所以使用static
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag){
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() +" 进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + " 进入2");
                }
            }
        }else {
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() +" 进入3");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() +" 进入4");
                }
            }
        }
    }
}
