package com.yzf.homework;

public class HomeWork08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        //checkingAccount.deposit(100);
        //checkingAccount.withdraw(200);
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(1000);//2000
        savingAccount.deposit(1000);//3000
        savingAccount.deposit(1000);//4000
        savingAccount.deposit(1000);//5000-1=4999.0
        savingAccount.withdraw(1000);// 4999 - (1000-1) = 4999 - 999 = 4000
        savingAccount.earnMonthlyInterest();//重置了手续费

    }
}
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(double amount) {
        if(balance > 0) {
            balance += amount;
            System.out.println(balance);
        }else {
            System.out.println("输入有误");
        }
    }
    //取款
    public void withdraw(double amount){
        if(balance > 0 && balance > amount) {
            balance -= amount;
            System.out.println(balance);
        }else {
            System.out.println("输入有误");
        }
    }

}
