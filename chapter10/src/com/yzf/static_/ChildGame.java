package com.yzf.static_;

public class ChildGame {
    public static void main(String[] args) {
        //int count = 0;
        child child1 = new child("刘芮");
        child1.join();
        //count++;
        child child2 = new child("刘倩");
        child2.join();
        //count++;
        child child3 = new child("冬梅");
        child3.join();
//        count++;

        System.out.println("共有" + child1.count + "名小孩加入了游戏");
    }
}

class child {
    private String name;
    public static int count = 0;
    public child(String name) {
        this.name = name;
        count++;
    }

    public void join(){
        System.out.println(name + "加入了游戏");
    }
}
