package com.hspedu.samllchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author:李强
 * @Date:2025/1/8
 * @Description:该类是完成零钱通的各个功能的类
 * 使用OOP(面向对象编程)
 * 将各个功能对应一个方法
 */

public class SmallChangeSysOOP {


    //属性
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //2.完成零钱通明细
    String details = "-------------零钱通明细------------------";

    //3.完成收益入账
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //用于日期格式化的

    //4.消费
    String note = "";

    //先完成显示菜单，并可以选择
    public void mainMenu() {
        do {
            System.out.println("\n-----------------零钱通菜单(OOP)---------------------");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退\t\t出");

            System.out.println("请选择(1-4):");
            key = scanner.next();

            //使用switch 分支控制
            switch (key) {
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
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        //money的值范围应该校验  一会在完善
        //找出不正确的金额条件，然后给出提示，就直接return
        if (money <= 0) {
            System.out.println("收益入账金额 需要大于 0");
            return;//退出方法，不在执行后面的代码
        }
        //找出正确金额的条件
        balance += money;
        //拼接收益入账信息到 details
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //消费
    public void pay() {
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        //money 的值范围应该校验  ->一会在完善
        //找出金额不正确的情况
        if (money <= 0 || money > balance) {
            System.out.println("你的消费金额 应该在 0-" + balance);
            return;
        }
        //找出正确的金额的条件
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        //拼接消费信息到 details
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;

    }

    //退出
    public void exit() {
        String choice = "";
        while (true) {
            System.out.print("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        //当用户退出while后，进行判断
        if (choice.equals("y")) {
            loop = false;
        }

    }
}
