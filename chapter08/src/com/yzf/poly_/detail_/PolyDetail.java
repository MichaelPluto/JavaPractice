package com.yzf.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型: 父类的引用指向了子类的对象
        //语法：父类类型引用名 = new 子类类型();
        Animal animal = new Cat();
        //向上转型调用方法的规则如下:
        //(1)可以调用父类中的所有成员(需遵守访问权限)
        //(2)但是不能调用子类的特有的成员
        //(3)因为在编译阶段，能调用哪些成员,是由编译类型来决定的
        //animal.catchMouse();错误
        //(4)最终运行效果看子类(运行类型)的具体实现, 即调用方法时，按照从子类(运行类型)开始查找方法
        //，然后调用，规则我前面我们讲的方法调用规则一致。
        animal.eat();//子类中有eat方法重写，所以会调用子类的eat() 猫吃鱼
        animal.run();//子类中无run()方法， 调用父类的run()
        animal.show();//调用父类
        animal.sleep();//调用父类
        //animal.catchMouse() 错误，编译类型是Animal Animal类中没有catchMouse()方法
        //                    编译时便决定了catchMouse()方法不能调用，所以在运行时也不能调用其子类的方法

        //希望可以调用catchMouse()方法
        //向下转型：
        //(1)语法：子类类型 引用名 =（子类类型）父类引用;
        //(2)要求父类的引用必须指向的是当前目标类型的对象
        Cat cat = (Cat) animal; // animal 最开始new Cat()时 便指向Cat对象
        cat.catchMouse();
        //Dog dog = (Dog) animal // 若将animal 强转为 Dog型 就相当于将 Cat转为Dog
                                // Cat和Dog都是 animal 但 Cat和Dog 不能相互转换
    }
}
