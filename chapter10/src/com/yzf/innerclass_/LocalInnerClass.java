package com.yzf.innerclass_;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m3();
    }
}
class Outer {
    public  int n2 = 200;
    private int n1 = 100;
    private void m1(){
        System.out.println("m1方法被调用");
    }
    public void m3(){
        Inner01 inner01 = new Inner01();
        inner01.m2();
    }
    class Inner01 {//内部类
        public void m2(){
            //1.可以直接访问外部类的所有成员，包含私有
            System.out.println("n1=" + " " + n1);
            System.out.println("n2=" + " " + n2);
            //2.不能添加访问修饰符，但可以用final修饰，这样内部类就不能被继承
            //3.作用域仅仅在定义他的方法或者代码块中，
            //Inner01作用域便在m2()中
            //4.局部内部类访问外部类的成员->直接访问
            m1();
            //5.外部类访问局部类成员时，外部类在方法中实例化局部类对象再访问
            //6.外部其他类，不能访问局部内部类
            //7.当外部类和局部内部类成员重名时，遵守就近原则，
            //可以使用 外部类名.this.成员名的方式来访问外部重名的成员
            int n1 = 300;
            System.out.println("内部n1= " + n1 + " " + "外部n1= " + Outer.this.n1);
        }
    }
}
