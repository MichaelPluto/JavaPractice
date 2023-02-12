package com.yzf.list;

import java.util.*;

@SuppressWarnings("all")
public class ListExercise02 {
    public static void main(String[] args) {

        //List list = new ArrayList();
        //List list = new Vector();
        List list = new LinkedList();
        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("水浒传", "施耐庵", 80));

        //增强for
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("===排序后===");
        Book.bubble(list);
        for (Object o : list) {
            System.out.println(o);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称: " + name + '\t' + "价格: " + price + '\t' + "作者: " + author;
    }
    public static void bubble(List list){
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                //向下转型获取 getPrice方法
                //取出对象Book
                Book book1 = (Book)list.get(j);//取出第j个对象
                Book book2 = (Book)list.get(j+1);//取出第j+1个对象
                if (book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}
