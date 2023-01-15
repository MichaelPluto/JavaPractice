package com.yzf.single_;
/*
    演示饿汉式单例模式
 */
public class SingleTon01 {
    public static void main(String[] args) {
        //System.out.println(Girlfriend.n1);
        Girlfriend instance = Girlfriend.getInstance();
        System.out.println(instance);
        Girlfriend instance1 = Girlfriend.getInstance();
        System.out.println(instance1);
        System.out.println(instance == instance1);
    }
}
class Girlfriend {
    private  String name;
    public static int n1 = 100;
    private Girlfriend(String name) {
        this.name = name;
        System.out.println("构造器被调用");
    }
    private static Girlfriend gf = new Girlfriend("刘芮");//饿汉式直接创建对象

    public static Girlfriend getInstance(){
        return gf;
    }
    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}