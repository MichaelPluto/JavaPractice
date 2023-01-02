package com.yzf.super_;

public class B extends A {
    public int n1 = 888;
    //访问父类的属性，但不能访问父类private属性
    //super.属性名
    public void hi(){
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);

    }
    //访问父类的方法，但不能访问privatre
    //super.方法名
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }
    public B(){
        //super(); 访问的父类的无参构造器
        //super("jack");//访问父类 A(String name)构造器
        super("jack, 22");//访问父类A(String name, int age)构造器
    }

    public void cal(){
        System.out.println("B类的cal()方法");
    }
    public void sum(){
        System.out.println("B类sum()方法");
        //希望调用父类-A 的 cal 方法
        //这时，因为子类 B 没有 cal 方法，因此我可以使用下面三种方式
        //找 cal 方法时(cal() 和 this.cal())，顺序是:
        // (1)先找本类，如果有，则调用
        // (2)如果没有，则找父类(如果有，并可以调用，则调用)
        // (3)如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object 类
        // 提示：如果查找方法的过程中，找到了，但是不能访问， 则报错, cannot access
        // 如果查找方法的过程中，没有找到，则提示方法不存在
        cal();
        this.cal();
        //找 cal 方法(super.cal()) 的顺序是直接查找父类，其他的规则一样
        super.cal();
        //希望调用父类-A的属性 == 与方法的规则相同
        System.out.println(n1);//888
        System.out.println(this.n1);//888
        System.out.println(super.n1);//100
    }
}
