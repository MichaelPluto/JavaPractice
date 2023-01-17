package com.yzf.interface_;

public class Test {
    public static void main(String[] args) {
        //创建手机，相机对象
        Phone phone = new Phone();
        Camera camera = new Camera();
        //创建电脑对象
        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("=============");
        computer.work(camera);
    }
}
