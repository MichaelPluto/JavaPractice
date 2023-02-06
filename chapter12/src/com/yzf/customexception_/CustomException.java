package com.yzf.customexception_;

public class CustomException {
    public static void main(String[] args) {
        int age = 5;
        if (age <= 18 && age >= 120){
            throw new AgeException("年龄需要在 18 - 120之间");
        }
        System.out.println("你的年龄范围正常");
    }
}
//自定义异常
//一般情况自定义异常是继承 RuntimeException，因为是运行异常
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
