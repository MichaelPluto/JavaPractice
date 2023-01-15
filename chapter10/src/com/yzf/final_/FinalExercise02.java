package com.yzf.final_;

public class FinalExercise02 {
    public int addOne(final int x){
        return  x + 1;
    }

    public static void main(String[] args) {
        System.out.println(new FinalExercise02().addOne(6));
    }
}

