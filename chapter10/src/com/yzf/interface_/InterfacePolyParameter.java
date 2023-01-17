package com.yzf.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        //接口的多态体现
        IE ie = new Monster();
        ie = new Car();
        //继承的多态体现
        //向上转型，父类引用的指向子类
        AAA aaa = new BBB();
        aaa = new CCC();

    }
}
interface IE {}
class Monster implements IE{}
class Car implements IE{}
class AAA {}
class BBB extends AAA{}
class CCC extends AAA{}