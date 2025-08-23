package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/1/14
 * @Description:chapter08
 */

public class BackAccount {
    private double balance;//余额

    public BackAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //存款
    public void deposit(double amount) {
        balance += amount;
    }

    //取款
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
