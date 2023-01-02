package com.yzf.poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //使用多态机制解决主人喂食问题
    //animal 编译类型是 Animal 可以接收 Animal子类的对象
    //food 编译类型是 Food 可以接收 Food子类的对象
    public void feed(Animal animal, Food food){
        System.out.println("主人：" +getName() + "给" + animal.getName() + "喂" + food.getName());
    }

//    public void feed(Dog dog, Bone bone){
//        System.out.println("主人：" +getName() + "给" + dog.getName() + "喂" + bone.getName());
//    }
//    public void feed(Cat cat, Fish fish){
//        System.out.println("主人：" +getName() + "给" + cat.getName() + "喂" + fish.getName());
//    }
}
