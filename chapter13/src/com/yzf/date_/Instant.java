package com.yzf.date_;

import java.util.Date;

public class Instant {
    public static void main(String[] args) {
        //1.通过静态方法now()获取表示当前时间的时间戳
        java.time.Instant now = java.time.Instant.now();
        System.out.println(now);
        Date date = Date.from(now);//把Instant转换成Date
        System.out.println(date);
        java.time.Instant instant = date.toInstant();//把Date转换成Instant
    }
}
