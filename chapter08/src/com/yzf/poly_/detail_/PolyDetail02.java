package com.yzf.poly_.detail_;

public class PolyDetail02 {
    //属性没有重写，属性的值看编译类型
    public static void main(String[] args) {
        Base base = new Sub();//向下转型
        //编译类型为 Base 所以在Base类中找属性 count
        System.out.println(base.count);//10
        Sub sub = new Sub();
        //编译类型为 Sub 所以在Sub类中找属性 count
        System.out.println(sub.count);//100
    }
}
class Base {
    int count = 10;
}
class Sub extends Base{
    int count = 100;
}
