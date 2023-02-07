package com.yzf.wrapper;

public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//F
        //底层是Integer.valueOf(1)需要阅读源码
        /*
        public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
        i 在 -128 - 127之间直接从数组赋值
        i不在这个范围内则会返回一个新的对象
         */
        Integer m = 1;
        Integer n = 1;
        System.out.println(n == m);//T
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//F
    }
}
