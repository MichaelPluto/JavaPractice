package com.yzf.homework_;

public class HomeWork07 {
    public static void main(String[] args) {
        new Car1(80.6).getAir().flow();
        new Car1(-6).getAir().flow();
        new Car1(35).getAir().flow();

    }
}
class Car1 {
    private double temperature;

            class Air {
                public void flow(){
                    if (temperature > 40){
                        System.out.println("吹冷气");
                    }else if (temperature < 0){
                        System.out.println("吹暖气");
                    }else {
                        System.out.println("关闭空调");
                    }
                }
            }
    public Air getAir(){
         return new Air();
    }
    public Car1(double temperature) {
        this.temperature = temperature;
    }
}
