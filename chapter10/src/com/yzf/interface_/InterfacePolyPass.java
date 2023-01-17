package com.yzf.interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向，实现了该接口的类的对象实例
        FPX fpx = new EDG();
        //如果FPX继承了IG 而EDG类实现了FPX接口
        //那么实际上EDG也实现了IG 接口·
        IG ig = new EDG();
    }
}
interface IG {
    void fight();
}
interface FPX extends IG{}
class EDG implements FPX{
    @Override
    public void fight() {

    }
}