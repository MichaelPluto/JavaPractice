package com.yzf.houserent.service;

import com.sun.javaws.IconUtil;
import com.yzf.houserent.domain.House;
import com.yzf.houserent.utility.Utility;

public class HouseService {
    /*
    定义House[]，保存House对象
    1.相映HouseService的调用
    2.完成对房屋信息的增删改查
     */
    private House[] houses;//保存House对象
    private int houseNum = 1;//记录当前有多少房屋信息
    private int idCounter = 1;

    public HouseService(int size) {
        houses = new House[size];//当创建House对象时，指定数组大小
        houses[0] = new House(1,"jack","116","金沙时代",2000,"未出租");

    }

    //添加findById方法 根据id查找房屋信息
    public House findById(int findId){
        for (int i = 0; i < houseNum; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
            return null;
    }
    //添加del方法 返回新的id值
    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i <houseNum; i++) {
            if(delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("没找到房屋编号");
            return false;
        }
            for (int i = 0; i < houseNum - 1; i++) {
                houses[i] = houses[i+1];
            }
            houses[--houseNum] = null;
            return true;
    }
    //添加add方法 返回新对象
    public boolean  add(House newHouse){
        //判断是否还可以继续添加
        if(houseNum  >= houses.length){
            System.out.println("数组已满，不能再添加");
            return false;
        }
        //把新的房屋信息加到数组中
        houses[houseNum++] = newHouse;
        //houseNum++;
        //设计一个id自增长机制
        //idCounter++;
        newHouse.setId(++idCounter);//更新newHouse的id
        return true;
    }
    //添加list方法，返回对象信息
    public House[] list(){
        return houses;
    }
}
