package com.yzf.abstract_;

public class AA extends Template{
    @Override
    public void job() {
        int sum = 0;
        for (int i = 0; i <= 10000000; i++) {
            sum += i;
        }
    }
}
