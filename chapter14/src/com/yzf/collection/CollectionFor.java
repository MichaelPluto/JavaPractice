package com.yzf.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        @SuppressWarnings("all")
        Collection col = new ArrayList();
        col.add(new Book1("三国演义", "罗贯中", 66.6));
        col.add(new Book1("红楼梦", "曹雪芹", 86.2));
        col.add(new Book1("射雕英雄传", "金庸", 43.5));

        //增强for循环，底层仍然是迭代器，也可以用于遍历数组
        //快捷键: 集合名/数组名.for
        for (Object book : col) {
            System.out.println(book);
        }
    }
}
class Book1{
    private String name;
    private String author;
    private double price;

    public Book1(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}