package com.yzf.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        //new IA();
    }
}
//1.接口不能被实例化
//2.接口中所有方法都是public方法，接口中的抽象方法可以不用abstract修饰
//3.一个普通类实现接口时，接口内所有的方法都必须在此类实现
//4.抽象类可以不用实现接口内的方法
interface IA {
    void say();
    public abstract void hi();
}
class AA implements IA {

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
abstract class BB implements IA {

}