package com.yzf.override;

public class Dog extends Animal{
    //1. 因为 Dog 是 Animal 子类
    //2. Dog 的 cry 方法和 Animal 的 cry 定义形式一样(名称、返回类型、参数)
    //3. 这时我们就说 Dog 的 cry 方法，重写了 Animal 的 cry 方法
    public void cry(){
        System.out.println("小狗汪汪叫...");
    }
    //子类方法重写 方法的返回类型必须是父类方法返回类型的同类(eg:Object)或者子类(eg:String)
    public String m1(){//String是父类m1()返回类型 Object的子类
        return null;
    }
//    public Object m1(){//
//        return null;
//    }
    //子类方法重写 子类方法的权限不能小于父类方法的权限
    //eg：Animal中m2()方法的权限是 protected
    //所以子类m2()方法的权限不能小于protected
    //权限必须为 同级的protected 或者 高级的 public
    /*
    public void m2(){

    }
    */

    protected void m2(){

    }
}
