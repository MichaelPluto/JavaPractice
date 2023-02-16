package com.yzf.customgeneric_;

public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);// E = Integer
        apple.fly(new Dog());// E = Dog
    }
}
class Dog{}
class Apple <T,R,M>{
    public <E> void fly(E e){
        System.out.println(e.getClass().getSimpleName());
    }
    //public void eat(U u);//错误，因为U 没有被声明，且eat也不是泛型方法
    public void run(R r){}
}