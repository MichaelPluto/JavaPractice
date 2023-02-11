package com.yzf.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        @SuppressWarnings("all")
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 66.6));
        col.add(new Book("红楼梦", "曹雪芹", 86.2));
        col.add(new Book("射雕英雄传", "金庸", 43.5));
        System.out.println(col);

        //想遍历集合
        //1.先得到 col对应的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历  加判断是否还有多的元素 快捷键 itit
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);
        }
        //3.当退出while后 迭代器此时指向最后元素 若使用 iterator.next()则会异常
        //4.若想再次遍历集合 则需要重置迭代器
        iterator = col.iterator();
        System.out.println("===重置后===");
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);
        }
    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
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