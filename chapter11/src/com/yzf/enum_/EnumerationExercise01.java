package com.yzf.enum_;

public class EnumerationExercise01 {
    public static void main(String[] args) {
    Gender boy = Gender.BOY;
    Gender boy2 = Gender.BOY;
        System.out.println(boy);//Gender类没有toString方法，所以找父类的toString
        //Gender是继承Enum类
        // public String toString() {
        //        return name;
        //    }

        System.out.println(boy == boy2);
    }
}
enum Gender {
    BOY, GIRL;
}
