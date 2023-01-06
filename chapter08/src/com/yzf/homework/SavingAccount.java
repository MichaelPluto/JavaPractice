package com.yzf.homework;

public class SavingAccount extends BankAccount{
    private int count = 3;
    private double rate = 0.01;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        //判断是否还可以免手续费
        if(count > 0){
            super.deposit(amount);
            count--;
        }else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(double amount) {
        //判断
        if(count > 0){
            super.withdraw(amount);
            count--;
        }else{
            super.withdraw(amount - 1);
        }
    }

    public void earnMonthlyInterest(){
        System.out.println("加上利息总余额=" + (super.getBalance() * rate + super.getBalance()));
        count = 3;
    }
}
