package com.yzf.junit_;

import org.junit.jupiter.api.Test;

public class JUnit {
    public static void main(String[] args) {

    }
}

class Junit{
    @Test
    public void m1(){
        System.out.println("m1方法被调用");
    }
    @Test
    public void m2(){
        System.out.println("m2方法被调用");
    }
}