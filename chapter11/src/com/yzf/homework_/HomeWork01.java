package com.yzf.homework_;

public class HomeWork01 {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car(100);
        System.out.println(c);
        System.out.println(c1);
    }
}
class Car {
    double price = 10;
    static String color = "white";

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price + "color=" + color +
                '}';
    }
    public Car(){
        this.price = 9;
        this.color = "red";
    }
    public Car(double price){
        this.price = price;
    }
}