package com.yzf.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        //证明，接口中的属性，只能时final，而且时 public static final修饰符
        System.out.println(IB.n1);//证明为static
        //IB.n1 = 5;//不能修改值，证明为final修饰的属性
        //在其他包内不能调用证明不为默认属性
    }
}
//一个类可以继承多个接口
interface IB {
    //接口中的属性，只能时final，而且时 public static final修饰符
    int n1 = 10;
    void hi();
}
interface IC {
    void hi();
}
class pig implements IB,IC{
    @Override
    public void hi() {

    }
}
//接口不能继承其他的类，但能继承多个接口
//类与接口时 implements
//接口与接口是 extends、
interface ID extends IB,IC{

}
//接口的类型只能是public和默认，这点和类的修饰符是一样的

