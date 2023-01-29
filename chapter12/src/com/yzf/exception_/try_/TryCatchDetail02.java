package com.yzf.exception_.try_;

public class TryCatchDetail02 {
    public static void main(String[] args) {
        /*
        1.try代码块可能有多个异常
        2.可以使用多个catch 分别捕获不同的异常，相应处理
        3.要求子类异常写在前，父类异常写在后
         */
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());
            int n1 = 5;
            int n2 = 0;
            int res = n1 / n2;
            System.out.println(res);
        }catch (NullPointerException e){
            System.out.println("空指针异常=" + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("算术异常=" + e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Person {
    private String name = "杨质飞";

    public String getName() {
        return name;
    }
}
