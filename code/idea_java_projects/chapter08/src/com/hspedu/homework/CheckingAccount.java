package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/1/14
 * @Description:chapter08
 */

public class CheckingAccount extends BackAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) { //存款
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {//取款
        super.withdraw(amount + 1);
    }
}
