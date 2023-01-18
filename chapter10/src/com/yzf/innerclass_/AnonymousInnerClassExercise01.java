package com.yzf.innerclass_;

public class AnonymousInnerClassExercise01 {
    public static void fi(IL il){
        il.hi();
    }
    public static void main(String[] args) {
    fi(new IL() {
        @Override
        public void hi() {
            System.out.println("这是一副名画..");
        }
    });
    //硬编码
    fi(new Tool());
    }
}
interface IL {
    void hi();
}
class Tool implements IL {
    @Override
    public void hi() {
        System.out.println("...");
    }
}