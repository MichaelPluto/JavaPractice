package com.yzf.date_;
public class Calendar {
    public static void main(String[] args) {
        //Calendar是一个抽象类，且构造器是private，不能被实例化
        //可以通过getInstance()方法来获取实例
        //1.创建日历类对象
        java.util.Calendar c = java.util.Calendar.getInstance();
        //System.out.println(c);
        //2.获取日历对象的某个日历字段
        System.out.println("年:" + c.get(java.util.Calendar.YEAR));
        System.out.println("月:" + c.get(java.util.Calendar.MONTH)+1);
        System.out.println("日:" + c.get(java.util.Calendar.DAY_OF_MONTH));
        System.out.println("小时:" + c.get(java.util.Calendar.HOUR));
        System.out.println("分钟:" + c.get(java.util.Calendar.MINUTE));
        System.out.println("秒:" + c.get(java.util.Calendar.SECOND));
        //Calendar没有相应的格式化方法，所以需要自己组合显示 比如
        System.out.println((c.get(java.util.Calendar.YEAR) + "-" + (c.get(java.util.Calendar.MONTH) + 1) + "-" +
                c.get(java.util.Calendar.DAY_OF_MONTH) +
                " " + c.get(java.util.Calendar.HOUR_OF_DAY) + ":" + c.get(java.util.Calendar.MINUTE) + ":" + c.get(java.util.Calendar.SECOND)));
    }
}
