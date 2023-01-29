package com.yzf.homework_;

import java.util.Scanner;

public class HomeWork08 {
    public static void main(String[] args) {
//        System.out.println("输入颜色（大写字母）");
//        Scanner scanner = new Scanner(System.in);
//        String key = scanner.next();
        //枚举值的switch使用
        Color color = Color.BLUE;
    switch (color){
        case RED:{
            Color.RED.show();
            break;
        }
        case BLUE:{
            Color.BLUE.show();
            break;
        }
        case BLACK:{
            Color.BLACK.show();
            break;
        }
        case YELLOW:{
            Color.YELLOW.show();
            break;
        }
        case GREEN:{
            Color.GREEN.show();
            break;
        }
        default:
            System.out.println("输入有误");
    }
    }
}
enum Color implements IA{
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性为=" + redValue + "," + greenValue + "," + blueValue);
    }
}
interface IA {
    void show();
}