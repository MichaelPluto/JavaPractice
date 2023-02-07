package com.yzf.wrapper;

public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d = 100d;//自动装箱Double
        Float f = 1.5f;//自动装箱Float
        //三元运算符是一个整体，会自动提升数据类型
        Object obj1 = true? new Integer(1) : new Double(2.0);
        System.out.println(obj1);

        Object obj2;
        if (true){
            obj2 = new Integer(1);
        }else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);
    }
}
