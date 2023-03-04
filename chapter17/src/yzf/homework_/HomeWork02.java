package yzf.homework_;

public class HomeWork02 {
    public static void main(String[] args) {
        Person person = new Person();
        Thread thread1 = new Thread(person);
        thread1.setName("Person1");
        Thread thread2 = new Thread(person);
        thread2.setName("Person2");
        thread1.start();
        thread2.start();
    }
}

class Person implements Runnable {
    private static int card = 10000;
    private boolean loop = true;
    @Override
    public void run() {
            while (loop) {
                synchronized (this) {
                if (card < 1000) {
                    loop = false;
                    System.out.println("余额不足，不可再取");
                    break;
                }
                    card -= 1000;
                System.out.println(Thread.currentThread().getName() + "取走一千块,剩余 " + card);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
