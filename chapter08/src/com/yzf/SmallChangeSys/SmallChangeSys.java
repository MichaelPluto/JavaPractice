package com.yzf.SmallChangeSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        //完成界面，需用到do-while
        boolean loop = true;
        //四个功能需要用到swich语句,并需要接收输入
        Scanner scanner = new Scanner(System.in);
            String key = "";
        //1.零钱通明细 Detail
            String Detail =    "----------------零钱通明细------------------" + "\n";
        //2.收益入账
            double balance = 0;
            double money = 0;
            Date date = null;//表示日期
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化
        //3.消费
            double cost = 0;
            String land ="";
        //4.退出
        //将loop置为false即可
        //5.对退出进行设置
            String answer = "";
        do{
            System.out.println("----------------零钱通菜单------------------");
            System.out.println("               1.零钱通明细                 ");
            System.out.println("               2.收益入账                 ");
            System.out.println("               3.消费                 ");
            System.out.println("               4.退     出                 ");
            System.out.print("请选择(1-4):");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println(Detail);
                    break;
                case "2":
                    date = new Date();
                    System.out.println("输入入账金额");
                    money = scanner.nextDouble();
                    if(money < 0){
                        System.out.println("输入金额有误");
                        break;
                    }
                    balance += money;
                    Detail += "\n" + "入账金额"+ " " + "+" + money + " " + sdf.format(date)  + " " + "余额:" + balance;
                    break;
                case "3":
                    date = new Date();
                    System.out.println("输入消费金额");
                    cost = scanner.nextDouble();
                    if(cost > balance || balance <= 0){
                        System.out.println("余额不足");
                        break;
                    }
                    System.out.println("输入消费地点");
                    land = scanner.next();
                    balance -= cost;
                    Detail += "\n" + land + "   " + "-" + cost + " " + sdf.format(date)  + " " + "余额:" + balance;
                    break;
                case "4":
                    while(true) {
                        System.out.println("是否要退出y/n？");
                        answer = scanner.next();
                        if ("y".equals(answer) || "n".equals(answer)) {
                            break;
                        }
                    }
                        if("y".equals(answer)){
                            loop = false;
                            break;
                        }
                default:
                    System.out.println("输入有误");
            }
        }while(loop);
    }
}
