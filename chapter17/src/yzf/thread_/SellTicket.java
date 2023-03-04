package yzf.thread_;

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
        SellTicket02 ticket02 = new SellTicket02();
        new Thread(ticket02).start();
        new Thread(ticket02).start();
        new Thread(ticket02).start();
    }
}

//使用继承Thread的 方法
class SellTicket01 extends Thread{
    private static int num = 100;

    @Override
    public void run() {
        while (true){
            System.out.println("窗口" + Thread.currentThread().getName() + " " + "售出一张票" + "剩余=" +
                    (--num) + "张票");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num <= 0){
                break;
            }
            System.out.println("售票结束");
        }
    }
}

//使用实现 Runnable 的方式
class SellTicket02 implements Runnable{
    private int num = 100;
    @Override
    public void run() {
        while (true){
            System.out.println("窗口" + Thread.currentThread().getName() + " " + "售出一张票" + "剩余=" +
                    (--num) + "张票");
            try {
                Thread.sleep(100 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (num <= 0){
                break;
            }
            System.out.println("售票结束");
        }
    }
}