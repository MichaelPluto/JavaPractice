package com.yzf.innerclass_;

public class InnerClass01 {

}
class Out {
    private String name;//属性

    public Out(String name) {//构造器
        this.name = name;
    }
    public void hi(){//方法

    }
    {
        System.out.println("sb");//代码块
    }
    class inner{//内部类

    }
}
