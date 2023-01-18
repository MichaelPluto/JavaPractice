package com.yzf.innerclass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Outer04().method();
    }
}
class Outer04 {
    private int n1 = 10;
    public void method(){
        //基于接口的匿名内部类
    /*
    1.需求：想使用IA接口，并创建对象
    2.传统方式，写一个类，实现该接口，并创建对象调用方法
    3.要求 tiger只使用一次，后面不在使用
    4.即使用匿名内部类来简化开发
    5.tiger的编译类型为 IA
    6.tiger的运行类型为 匿名内部类 Outer0$1
    7.jdk底层在创建匿名内部类 Outer0$1 立即就创建了Outer0$1实例，并且把地址返回给tiger
    8.匿名内部类使用一次，就不能再使用了

     */
        //传统方法 ：new tiger().cry();
        //匿名内部类
        IA tiger = new IA(){

            @Override
            public void cry() {
                System.out.println("老虎在叫唤");
            }
        };
        System.out.println("tiger的运行类型= " + tiger.getClass());
        tiger.cry();
        //基于类的匿名内部类
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father的运行类型= " + father.getClass() );
        father.test();
    }

}
interface IA {
     void cry();
}
//class tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println("老虎在叫唤..");
//    }
//}
class Father {
    public Father(String name) {
        System.out.println("name=" + name);
    }

    public void test(){

    }
}