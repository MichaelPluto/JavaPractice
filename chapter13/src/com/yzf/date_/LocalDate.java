package com.yzf.date_;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate {
    public static void main(String[] args) {
        //第三代日期
        //1.使用now()返回表示当前的日期时间的对象
        java.time.LocalDateTime ldt = java.time.LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = dtf.format(ldt);
        System.out.println(format);
        System.out.println(ldt);
//        System.out.println("年=" + ldt.getYear());
//        System.out.println("月=" + ldt.getMonth());
//        System.out.println("月=" + ldt.getMonthValue());
//        System.out.println("日=" + ldt.getDayOfMonth());
//        System.out.println("时=" + ldt.getHour());
//        System.out.println("分=" + ldt.getMinute());
//        System.out.println("秒=" + ldt.getSecond());

        java.time.LocalDate now = java.time.LocalDate.now();//可以获取年月日
        LocalTime now1 = LocalTime.now();//可以获取时分秒
        LocalDateTime plusDays = ldt.plusDays(800);//八百天后
        //格式化
        String format1 = dtf.format(plusDays);
        System.out.println(format1);
        LocalDateTime minusMinutes = ldt.minusMinutes(800);//800分钟前
        String format2 = dtf.format(minusMinutes);
        System.out.println(format2);
        LocalDateTime minusYears = ldt.minusYears(1);//一年前的时间
        System.out.println(dtf.format(minusYears));
        LocalDateTime plusYears = ldt.plusYears(1);//一年后的时间
        System.out.println(dtf.format(plusYears));
    }
}
