package com.yzf.abstract_;

public class BB extends Template{
    @Override
    public void job() {
        int sum = 0;
        for (int i = 0; i <= 5000000; i++) {
            sum *= i;
        }
    }
}
