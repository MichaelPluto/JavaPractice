package com.yzf.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2.1);
        System.out.println(circle.calArea());

    }
}
class Circle {
    private double radius;
    //private final double PI = 3.14;
    private final double PI;

    public Circle(double radius) {
        this.radius = radius;
        PI = 3.14;
    }
    public double calArea(){
        return PI * radius * radius;
    }
//    private final double PI;
//    {
//        PI = 3.14;
//    }
}
