package com.yzf.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        new DD().hi();
    }
}
class AA {
    //普通final 可以在三个地方赋值
    //1.定义时赋值
    public final double TAX_RATE1 = 0.08;
    //2.构造器中赋值
    public final double TAX_RATE2;

    public AA() {
        TAX_RATE2 = 0.09;
    }
    //3.在代码块中赋值
    public final double TAX_RATE3;
    {
        TAX_RATE3 = 0.10;
    }
}
class BB {
    //如果fianl修饰的属性时静态的，则只能在两处赋值
    //1.定义时赋值
    public final static double TAX_RATE4 = 0.11;
    //2.在静态代码块中赋值
    public final static double TAX_RATE5;
    static {
        TAX_RATE5 = 0.12;
    }
//    3.不可以在构造器中赋值
//    public final static double TAX_RATE6;
//
//    public BB() {
//        TAX_RATE6 = 0.13
//    }
}
// final类不能继承，但能实例化对象
final class CC {
    public int age = 22;
}
//如果类不是final类，但含有final方法，则方法不能被重写，但类能被继承
class DD {
    public final void hi(){
        System.out.println("...");
    }
}
class EE extends DD {
//    @Override
//    public void hi() {
//        super.hi();
//    }
}
