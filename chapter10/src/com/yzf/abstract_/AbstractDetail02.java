package com.yzf.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
//如果一个类继承了抽象类，则他必须实现抽象类的所有抽象方法，除非他自己也声明为abstract类
abstract class E {
    public abstract void hi();
}
abstract class F extends E{

}
class G extends E {
    @Override
    public void hi() {

    }
}
abstract class D {
    public int n1 = 1;
    public  static  String name = "111";
    public void hi(){
        System.out.println("hi");
    }
    public static void cry(){

    }
    public abstract void hello();


}
