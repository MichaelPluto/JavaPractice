package com.yzf.interface_;

public class DBOracle implements DBInterface{
    @Override
    public void connect() {
        System.out.println("链接oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle");
    }
}
