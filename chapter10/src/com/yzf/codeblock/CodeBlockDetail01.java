package com.yzf.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //类被加载的三种情况
        //1.new 一个对象时候被加载
        //new BB();

        //2.new 一个子类对象时，父类也会被加载，而且父先子后
       // new AA();

        //3.使用类的静态成员时（静态方法，静态属性），类被加载
        //System.out.println(Cat.age);

        //static代码块，时再类加载时执行的，只会执行一次
        //普通代码块， new一个对象就会执行一次
        //BB bb1 = new BB();//BB类静态代码块只会执行一次
        //BB bb2 = new BB();

        //若只是使用类的静态成员时，普通代码块并不会执行
        //静态代码块一定会执行
        System.out.println(DD.fee);
        System.out.println(new DD().price);

    }
}
class DD {
    public int price = 100;//普通属性
    public static int fee = 150;//静态属性
    static {
        System.out.println("DD类的静态代码块被执行");
    }
    {
        System.out.println("DD类的普通代码块被执行");
    }
}
class Cat {
    public static int age = 22;
}
class BB{
    static {
        System.out.println("BB类代码块被执行");
    }
}
class AA extends BB{
    static {
        System.out.println("AA类代码块被执行");
    }
}
