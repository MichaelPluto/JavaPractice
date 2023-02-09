package com.yzf.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("java从入门到放弃", 100);
      //按价格从大到小
      Arrays.sort(books, new Comparator() {
          @Override
          public int compare(Object o1, Object o2) {
              Book book1 = (Book)o1;
              Book book2 = (Book)o2;
              return (int)(book2.getPrice() - book1.getPrice());
          }
      });
        System.out.print(Arrays.toString(books) + "\n");

        //按价格从小到大
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                return (int)(book1.getPrice() - book2.getPrice());
            }
        });
        System.out.print(Arrays.toString(books) + "\n");

        //按书名长度从大到小
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                return (book2.getName().length() - book1.getName().length());
            }
        });
        System.out.print(Arrays.toString(books) + "\n");

        //按书名长度从大到小
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                return (book1.getName().length() - book2.getName().length());
            }
        });
        System.out.print(Arrays.toString(books));
    }


}
class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
