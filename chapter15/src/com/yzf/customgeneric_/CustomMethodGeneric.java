package com.yzf.customgeneric_;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",5000000);// T = String R = Integer
        car.fly(11.1,5.0f);// T = Double R = Float

    }
}
//自定义泛型方法
/*
    1.泛型方法，可以定义在普通类中，也可以定义在泛型类中
    2.当泛型方法被调用时，类型会确定
    3.public void eat(E e){}，修饰符后没有<T,R..> ear方法不是泛型方法而是使用了泛型

 */
class Car{
    public void run(){
        //普通方法
    }
    public <T,R>void fly(T t, R r){
        //泛型放啊
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}
class Fish<T,R>{
    //泛型类
    public <U,M> void show(U u,M m){
        //泛型方法
        //泛型方法可以使用类声明的泛型，也可以自己声明泛型
    }
    public  void eat(T t, R r){
        //不是泛型方法，只是使用了泛型
    }
}