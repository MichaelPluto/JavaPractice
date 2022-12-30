package com.yzf.encap;

import java.util.Scanner;

public class Account {
//    创建程序,在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性。
//     * Account 类要求具有属性：姓名（长度为 2 位 3 位或 4 位）、余额(必须>20)、
//     * 密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
//     * 通过 setXxx 的方法给 Account 的属性赋值。
//     * 在 AccountTest 中测试

}
class MyTools{
    public String name;
    private double balance;
    private String password;

    public MyTools() {
    }

    public MyTools(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }else {
            System.out.println("输入的名字长度有误，将给予一个默认值 刘芮");
            this.name = "刘芮";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 20) {
            this.balance = balance;
        }else{
            System.out.println("余额不足 你个穷鬼");
        }
    }

    public String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入密码");
        String i = scanner.next();
        if( i.length() == 6 ){
            return password;
        }else {
            System.out.println("密码输入错误 给与默认密码");
            this.password = "123";
        }
            return password;
    }

    public void setPassword(String password) {

        this.password = password;

    }
    public boolean info(){
        if(getPassword() == "123456"){
            System.out.println("姓名=" + getName() + " " + "余额=" +getBalance()+ " " + "密码=" + getPassword());
            return true;
    }else {
        return false;
        }
    }
}
