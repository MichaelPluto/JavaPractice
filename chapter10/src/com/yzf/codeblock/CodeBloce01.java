package com.yzf.codeblock;

public class CodeBloce01 {
    public static void main(String[] args) {
        movie movie1 = new movie("阿凡达");
        movie movie2 = new movie("黑客帝国", 55);
        movie movie3 = new movie("泰坦尼克号", 50, "卡梅隆");
    }
}
class movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影开始了");
        System.out.println("进入广告时间");
        System.out.println("电影正式开始\n");
    }
    public movie(String name) {
        this.name = name;
    }

    public movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
