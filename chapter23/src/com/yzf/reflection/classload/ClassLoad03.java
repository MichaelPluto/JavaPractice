package com.yzf.reflection.classload;

public class ClassLoad03 {
    public static void main(String[] args) {
        /**
         * 1.加载B类， 并生成 B的class对象
         * 2.链接 num = 0；
         * 3.初始化阶段
         *      依次自动收集类中的所有静态变量的赋值动作和静态代码块中的语句
         *      clinit(){
         *          System.out.println("B 的静态代码块被执行");
         *         num = 300;
         *         num = 100;
         *      }
         *      合并: num = 100;
         */
        new B();
        System.out.println(B.num);//调用静态成员时，会加载类，执行静态代码块和静态成员方法等
                                  // 但类只会加载一次
    }
}
class B {
    static {
        System.out.println("B 的静态代码块被执行");
        num = 300;
    }
    static int num = 100;
    public B(){
        System.out.println("B的构造器被执行");
    }
}
