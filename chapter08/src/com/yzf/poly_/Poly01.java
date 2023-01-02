package com.yzf.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master jack = new Master("jack");
        Dog tom = new Dog("小狗");
        Bone bone = new Bone("大骨头");
        jack.feed(tom, bone);//将对象作为传参传入
        System.out.println("=====================");
        Cat jerry = new Cat("小猫");
        Fish fish = new Fish("黄辣丁");
        jack.feed(jerry,fish);
        System.out.println("=====================");
        Pig pig = new Pig("花猪");
        Rice rice = new Rice("米饭");
        jack.feed(pig, rice);
    }
}
