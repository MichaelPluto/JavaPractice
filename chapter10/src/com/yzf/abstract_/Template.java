package com.yzf.abstract_;

abstract public class Template {
    public abstract void job();
    public void calculate(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("耗时" +  (end - start));
    }
}
