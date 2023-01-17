package com.yzf.interface_;

public interface UsbInterface {
    //jdk7.0前接口里的方法都是抽象方法
    //jdk8.0后都可以有
    public void start();
    public void end();
}
