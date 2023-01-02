package com.yzf.poly_.objpoly_;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.cry();
        //编译类型为 Animal 运行类型为Dog
        //所以会执行Dog类中的cry
        animal = new Dog();
        animal.cry();
        //编译类型为 Animal 运行类型为Cat
        //所以会执行Cat类中的cry
        animal = new Cat();
        animal.cry();
    }
}
