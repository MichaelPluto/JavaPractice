package com.yzf.exception_.try_;

public class TryCatchDetail {
    public static void main(String[] args) {
        /*
        1.如果异常发生，则异常发生后的代码不会执行，直接进入刀catch块中
        2.如果异常没有发生，则顺序执行try的代码块不会进入到catch
        3.如果不管是否发生异常都希望执行某段代码，可以使用finally
         */
        try {
            String str = "jack";
            int a = Integer.parseInt(str);
            System.out.println("数字: " + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        }finally {
            System.out.println("finally代码块被执行..");
        }
        System.out.println("程序继续执行");
    }
}
