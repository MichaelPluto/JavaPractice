package com.yzf.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 1, 20000, 5000);
        CommonEmployee mary = new CommonEmployee("mary", 7, 15000);
        jack.work();
        mary.work();
    }
}

