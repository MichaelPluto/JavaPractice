package com.yzf.homework;

public class HomeWork09 {
    public static void main(String[] args) {
        LabeledPoint black = new LabeledPoint(230.07, 1929, "black");
    }
}
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }
}
