package com.yzf.interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {
        new CI().pX();
    }
}
interface AI{
    int x = 0;
}
class BI {
    int x = 1;
}
class CI extends BI implements AI{
    public void pX(){
        System.out.println(AI.x);
        System.out.println(super.x);
    }
}