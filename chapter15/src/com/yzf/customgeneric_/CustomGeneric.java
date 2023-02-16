package com.yzf.customgeneric_;

public class CustomGeneric {
    public static void main(String[] args) {

    }
}
//1.Tiger 后面是泛型，所以把Tiger成为自定义泛型类
//2.T,R,M 泛型标识符，一般为单个大写字母
//3.泛型标识符可以有多个
//4.普通成员可以使用泛型
//5.使用泛型的数组是不能初始化的
//6.静态成员不能使用泛型
class Tiger<T,R,M>{
    String name;
    R r;//属性使用泛型
    M m;
    T t;
    //T[] ts = new T[8];//使用泛型的数组是不能初始化的,因为数组在 new时不能确定T的类型，就无法在内存开空间

    public Tiger(String name, R r, M m, T t) {//构造器使用泛型
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }
    //public static void m1(M m){}//因为静态属性会在类加载的时候就初始化，使用泛型 JVM就不能初始化
    public String getName() {//方法使用泛型
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}