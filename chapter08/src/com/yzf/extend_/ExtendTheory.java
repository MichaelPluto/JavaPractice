package com.yzf.extend_;

public class ExtendTheory {
    public static void main(String[] args) {
        Son son = new Son();
        //当new一个子类对象时，会与其对应的父类形成查找关系
        //要按查找规则来返回信息
        //找儿子还钱，儿子有就还，没有就找老子还，同理一次往上查找
        //直到找到为止，但若有private 则会报错，需要通过父类中华公有方法
        //来进行查找
        System.out.println(son.name);
        System.out.println(son.getAge());
        System.out.println(son.hooby);

    }

}
class GrandPa {
    String name = "大头爷爷";
    String hooby = "旅游";
}
class Father extends GrandPa {
    String name = "大头爸爸";
    private int age = 39;

    public int getAge(){
        return age;
    }
}
class Son extends Father {
    String name = "大头儿子";
}
