package com.yzf.interface_;

public class DBMysql implements DBInterface{
    @Override
    public void connect() {
        System.out.println("链接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
