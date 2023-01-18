package com.yzf.innerclass_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.method();
    }
}
class Outer05 {
    private int n1 = 99;
    public void method(){
        //第一种匿名内部类调用方法
//        Person p = new Person(){
//            @Override
//            public void test() {
//                System.out.println("测试中..");
//            }
//        };
//        p.test();
        //第二种匿名内部类调用方法
        new Person() {//先声明，返回对象
            //匿名内部类不能添加访问修饰符
            //作用域和局部内部类一样
            @Override
            public void test() {
                    int n1 = 66;
                /*
                1.可以直接访问外部类的所有成员
                2.外部类和匿名内部类成员重名是，遵守就近原则，可用 外部类名.this.属性名访问外部的重名成员
                 */
                System.out.println(n1);//1.
                System.out.println(Outer05.this.n1);//2.
                System.out.println("测试中..");
            }

            @Override
            public void hi(String str) {
                super.hi(str);
            }
        }.hi("jack");//直接调用方法即可
    }
}
class Person {
    public void hi(String str){
        System.out.println("str= " + str);
    }
    public void test(){
        System.out.println("test");
    }
}