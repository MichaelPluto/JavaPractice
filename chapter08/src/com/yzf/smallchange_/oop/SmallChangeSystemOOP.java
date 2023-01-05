package com.yzf.smallchange_.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSystemOOP {
    //属性
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    //1.零钱通明细
    String key = "";
    String Detail = "----------------零钱通明细------------------" + "\n";
    //2.收益入账
    double moneny = 0;
    double balance = 0;
    Date date = null;//表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化
    //3.消费
    double cost = 0;
    String land = "";
    //4.退出

    public void mainMenu(){
        do{
            System.out.println("----------------零钱通菜单------------------");
            System.out.println("             1 零钱通明细");
            System.out.println("             2 收益入账");
            System.out.println("             3 消费");
            System.out.println("             4 退     出");
            System.out.print("请选择（1-4）：");
            key = scanner.next();

            switch (key){
                case "1":
                   this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                   this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误");
            }
        }while (loop);
    }

    public void detail(){
        System.out.println(Detail);
    }

    public void income(){
        System.out.print("输入入账金额: ");
        moneny = scanner.nextDouble();
        //过关斩将判断方式
        if(moneny <= 0){
            System.out.println("入账金额需大于0");
            return;//退出方法，不执行后面代码
        }
        date = new Date();//获取当前的日期
        balance += moneny;
        Detail += "\n" + "收益入账" + "\t" + "+" + moneny + "\t" + sdf.format(date) + "\t\t" + "余额:" + balance;
    }

    public void pay(){
        System.out.println("消费");
        System.out.println("输入消费金额");
        cost = scanner.nextDouble();
        if(cost <= 0 || cost > balance){
            System.out.println("消费金额应在0-" + balance + "之间");
            return;
        }
        System.out.println("消费地点");
        land = scanner.next();
        date = new Date();//获取当前的日期
        balance -= cost;
        Detail += "\n" + land + "\t" + "-" + cost + "\t" + sdf.format(date) + "\t\t" + "余额:" + balance;
    }

    public void exit(){
        String choice ="";
        while(true) {
            System.out.println("确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice)|| "n".equals(choice)) {
                break;
            }
        }
        if ("y".equals(choice)) {
            loop = false;
        }
    }
}
