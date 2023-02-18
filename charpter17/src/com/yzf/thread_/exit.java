package com.yzf.thread_;

public class exit {
    // 启动一个线程 t ，要求再卖弄线程中去停止线程 t
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        new Thread(t).start();
        Thread.sleep(10 * 1000);
        System.out.println("哥们儿，时间到了");
        t.setLoop(false);
    }
}
class T implements Runnable{
    private int num = 0;
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
        System.out.println((++num));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}