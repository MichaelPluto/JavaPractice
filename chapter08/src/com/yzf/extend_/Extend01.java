package com.yzf.extend_;

public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "刘芮";
        pupil.age = 21;
        pupil.setScore(100);
        pupil.testing();
        pupil.showInfo();
        System.out.println("====================");
        Graduate graduate = new Graduate();
        graduate.name = "杨质飞";
        graduate.age = 22;
        graduate.setScore(99.9);
        graduate.testing();
        graduate.showInfo();

    }
}
