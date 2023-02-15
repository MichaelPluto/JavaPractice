package com.yzf.customgeneric_;

public class CustomGenericInterface {
    public static void main(String[] args) {

    }
}
//自定义泛型接口
//1.接口中，静态成员也不能和使用泛型
//2.泛型接口的类型，在继承接口或者实现接口时确定
//3.没有指定类型则默认为Object
interface IUsb <U,R>{
    //普通方法中，可以使用接口泛型
    R get();
    void hi(R r);
    void say(U u);
    void cry(U u1, U u2, U u3);
    //在jdk8中可以在接口中使用默认方法
    default R method(U u){
        return null;
    }
}
class D implements  MyInterface{
    @Override
    public Integer get() {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void say(String s) {

    }

    @Override
    public void cry(String u1, String u2, String u3) {

    }
}
interface MyInterface extends IUsb<String, Integer>{}
class A implements  IUsb<String ,Integer>{
    @Override
    public Integer get() {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void say(String s) {

    }

    @Override
    public void cry(String u1, String u2, String u3) {

    }
}
class C implements  IUsb{
    @Override
    public Object get() {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void say(Object o) {

    }

    @Override
    public void cry(Object u1, Object u2, Object u3) {

    }
}