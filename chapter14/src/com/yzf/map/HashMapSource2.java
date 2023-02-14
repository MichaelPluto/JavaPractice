package com.yzf.map;

import java.util.HashMap;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        for (int i = 1; i < 12; i++) {
            map.put(new A(i), i);
        }
        System.out.println(map);
        map.put("jack",22);
        map.put("tom",22);
        map.put("jack",23);
    }
}
class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num == a.num;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
