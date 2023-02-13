package com.yzf.map;

import java.util.*;

public class MapExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, new Worker("jack", 25000, 1));
        map.put(2, new Worker("tom", 5000, 2));
        map.put(3, new Worker("mar", 19000, 3));

        //KeySet 遍历
        Set Keyset = map.keySet();
        System.out.println("===增强for===");
        for (Object key :Keyset) {
            Worker worker = (Worker) map.get(key);//向下转型，取得Worker中的get()方法
            if (worker.getSal() > 18000){
                System.out.println(key + "-" + map.get(key));
            }
        }
        System.out.println("===迭代器===");
        Iterator iterator = Keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Worker worker = (Worker) map.get(key);//
            if (worker.getSal() > 18000){
                System.out.println(key + "-" + map.get(key));
            }
        }
        System.out.println("========== ");
        //entrySet 遍历
        Set entrySet = map.entrySet();
        for (Object key : entrySet) {
            Map.Entry  m = (Map.Entry) key;
            Worker worker = (Worker) m.getValue();
            if (worker.getSal() > 18000){
                System.out.println(m.getKey() + "-" + m.getValue());
            }
        }
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry m =(Map.Entry)  iterator1.next();
            Worker worker =(Worker) m.getValue();
            if (worker.getSal() > 18000){
                System.out.println(m.getKey() + "-" + m.getValue());
            }
        }
    }
}
class Worker{
    private String name;
    private double sal;
    private int id;

    public Worker(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}