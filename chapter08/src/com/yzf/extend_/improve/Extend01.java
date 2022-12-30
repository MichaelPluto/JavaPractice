package com.yzf.extend_.improve;

import com.yzf.extend_.Graduate;
import com.yzf.extend_.Pupil;

public class Extend01 {
    public static void main(String[] args) {
        com.yzf.extend_.Pupil pupil = new Pupil();
        pupil.name = "刘芮";
        pupil.age =18;
        pupil.setScore(100);
        pupil.testing();
        pupil.showInfo();
        System.out.println("====================");
        com.yzf.extend_.Graduate graduate = new Graduate();
        graduate.name = "杨质飞";
        graduate.age = 23;
        graduate.setScore(94.6);
        graduate.testing();
        graduate.showInfo();

    }
}

