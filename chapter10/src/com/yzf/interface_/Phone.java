package com.yzf.interface_;

public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void end() {
        System.out.println("手机停止工作");
    }
}
