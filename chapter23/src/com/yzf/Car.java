package com.yzf;

public class Car {
    public String brand = "保时捷";
    public double price = 500000;
    public String color = "灰色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
