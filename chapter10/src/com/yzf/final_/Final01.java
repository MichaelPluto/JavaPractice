package com.yzf.final_;

public class Final01 {

}
//不希望类被继承
final class  A {

}
//class B extends A{
//
//}
class C {
    //不希望方法被重写
    public final void hi(){
        System.out.println("hello");
    }
}
class D extends C{
//    @Override
//    public void hi() {
//        super.hi();
//    }
}
class E {
    //不希望属性被修改
    public  double TAX_RATE = 0.09;
}
class F{
    public void cry(){
        //不希望局部变量被修改
        final double RATE = 0.09;
       // RATE = 0.08;
        System.out.println("RATE= " + RATE);
    }

}