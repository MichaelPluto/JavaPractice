package com.yzf.exception_;

public class Exception01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        //ctrl + alt + t 选择 try-catch
        try {
            int res = n1 / n2;
        } catch (Exception e) {
            System.out.println("异常的原因是" + e.getMessage());
        }
        System.out.println("程序继续执行..");
    }
}
