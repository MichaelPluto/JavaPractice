package com.yzf.math_;

public class MathMethod {
    public static void main(String[] args) {
        //1.abs 绝对值
        int abs = Math.abs(-9);//9
        System.out.println(abs);
        //2.pow 求幂
        double pow = Math.pow(3.2,2.3);
        System.out.println(pow);
        //3.ceil 向上取整
        double ceil = Math.ceil(2.35);
        System.out.println(ceil);//3.0
        //4.floor 向下取整
        double floor = Math.floor(2.35);//2.0
        System.out.println(floor);
        //5.round 四舍五入
        long round = Math.round(-5.001);
        System.out.println(round);//-5
        //6.sqrt 开方
        double sqrt =   Math.sqrt(9.0);
        System.out.println(sqrt);//3.0
        //7.random 返回随机数 [0,1)
        //获取一个a-b之间的随机整数; a = 2, b = 7
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(2 + Math.random()*7 - 2 + 1));
        }
    }
}
