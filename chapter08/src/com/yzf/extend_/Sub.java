package com.yzf.extend_;

public class Sub extends Base{

    public Sub(String name,int age){
        //1.调用无参构造器
        //super();//可以写，也可以省略
        //2.调用父类的Base(String name)构造器
        super("杨质飞");
        System.out.println("子类Sub(String name,int age)构造器被调用");


    }

    public Sub(){//无参构造器
        //super();
        //若父类中无参构造器被覆盖，则必须使用super语句
        super("Tom" , 22);
        System.out.println("子类sub()构造器被调用");
    }

    //当创建子类对象时，不管使用子类哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name){
        super("KFC", 99);
        System.out.println("子类的Sub(String name)构造器被调用");
    }

//    public void sayOk(){
//        //发现 父类的非private 属性和方法都可以访问
//        System.out.println(n1 + " " + n2 + " " + n3 + " " + getN4());
//        test100();
//        test200();
//        test300();
//        call400();//可以用公共的方法 访问私有的方法
//    }
}

