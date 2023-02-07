package com.yzf.wrapper;

public class WrapperExercise03 {
    public static void main(String[] args) {
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//F

        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//F

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);//T

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i8 == i7);//F

        Integer i9 = 127;
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);//F
        //只要有基本数据类型，则判断的就是值是否相等
        Integer i11 = 127;
        int i12 = 127;
        System.out.println(i11 == i12);//T

        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13 == i14);//T
    }
}
