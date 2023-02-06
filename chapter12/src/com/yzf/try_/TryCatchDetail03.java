package com.yzf.try_;

public class TryCatchDetail03 {
    public static void main(String[] args) {
        /*
        try-finally这种用法相当于没有捕获异常
        因此程序会直接退出。
        应用场景为执行一段代码不管是否发生异常都必须执行某个业务逻辑
         */
        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1 / n2);
        } finally {
            System.out.println("执行了finally");//执行完此步骤程序将会退出
        }
        System.out.println("程序继续执行");
    }
}
