package com.yzf.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("孙悟空");
        wuKong.climbing();
        wuKong.flying();
        wuKong.swimming();
    }
}
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void climbing(){
        System.out.println(name + "会爬树");
    }
}
interface fish {
    void swimming();
}
interface bird {
    void flying();
}
class LittleMonkey extends Monkey implements fish,bird{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void climbing() {
        System.out.println(getName() + "会爬树");
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习后会游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习后会飞");
    }
}
