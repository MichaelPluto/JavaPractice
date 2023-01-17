package com.yzf.interface_;

public class DB2 implements DBInterface{
    @Override
    public void connect() {
        System.out.println("链接DB2");
    }

    @Override
    public void close() {
        System.out.println("关闭DB2");
    }
}
