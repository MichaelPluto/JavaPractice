package com.yzf.houserent.view;

import com.yzf.houserent.domain.House;
import com.yzf.houserent.service.HouseService;
import com.yzf.houserent.utility.Utility;

/*
    界面
   1.显示界面
   2.接收用户输入信息
   3.调用HouseService的方法，完成对房屋的操作实现
 */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);

    //编写updateHouse() 修改房屋信息
    public void updateHouse() {
        System.out.println("-------------修改房屋--------------\n");
        System.out.print("请选择待修改的房屋编号(-1退出):");
        int updateNum = Utility.readInt();
        if (updateNum == -1) {
            System.out.println("-------------放弃修改房屋--------------\n");
            return;
        }
        House house = houseService.findById(updateNum);
        if (house == null) {
            System.out.println("查找的房屋信息id不存在");
        }
        System.out.print("姓名(" + house.getName() + ")");
        String updateName = Utility.readString(10, "");
        if (!"".equals(updateName)) {
            house.setName(updateName);
        }
        System.out.print("电话(" + house.getPhone() + ")");
        String updatePhone = Utility.readString(10, "");
        if (!"".equals(updatePhone)) {
            house.setPhone(updatePhone);
        }
        System.out.print("地址(" + house.getAddress() + ")");
        String updateAddress = Utility.readString(5, "");
        if (!"".equals(updateAddress)) {
            house.setAddress(updateAddress);
        }
        System.out.print("租金(" + house.getRent() + ")");
        int updateRent = Utility.readInt(-1);
        if (updateRent != -1) {
            house.setRent(updateRent);
        }
        System.out.print("状态(" + house.getState() + ")");
        String updateState = Utility.readString(3, "");
        if (!"".equals(updateState)) {
            house.setState(updateState);
        }
        System.out.println("-------------修改完成--------------\n");
    }

    //编写findHouse() 查找房屋信息
    public void findHouse() {
        System.out.println("-------------查找房屋--------------\n");
        System.out.print("输入你要查找的id:");
        int findNum = Utility.readInt();
        House house = houseService.findById(findNum);
        if (house != null) {
            System.out.println(house);
        }
        System.out.println("查找房屋信息id不存在");

    }

    //编写exit() 退出程序
    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //编写delHouse() 接收用户输入，调用Service的方法
    public void delHouse() {
        System.out.println("-------------删除房屋--------------");
        System.out.print("请选择待删除的房屋编号(-1退出):");
        int delId = Utility.readInt(3);
        if (delId == -1) {
            System.out.println("-------------放弃删除房屋--------------");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if ('Y' == choice) {
            if (houseService.del(delId)) {
                System.out.println("-------------删除房屋成功--------------");
            } else {
                System.out.println("-------------删除房屋失败--------------");
            }
        } else {
            System.out.println("-------------放弃删除房屋--------------");
        }
    }

    //编写addHouse() 显示增加房屋信息
    public void addHouse() {
        System.out.println("-------------添加房屋--------------");
        System.out.print("姓名: ");
        String name = Utility.readString(4);
        System.out.print("电话: ");
        String phone = Utility.readString(10);
        System.out.print("地址: ");
        String address = Utility.readString(10);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态(未出租/已出租): ");
        String state = Utility.readString(3);
        //创建一个新的House对象,注意id是系统分配的，用户不能输入
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {//调用add方法，若返回true
            System.out.println("-------------添加成功--------------");
        } else {//若返回false
            System.out.println("-------------添加失败--------------");
        }
    }

    //编写listHouse() 显示房屋信息
    public void listHouse() {
        System.out.println("-------------房屋列表--------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//得到房屋所有信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("-------------房屋列表显示完成--------------");
    }

    public void mainMenu() {
        do {
            System.out.println("-------------房屋出租系统--------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.print("请选择(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("输入有误");
            }
        } while (loop);

    }
}
