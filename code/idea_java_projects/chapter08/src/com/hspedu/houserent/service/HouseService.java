package com.hspedu.houserent.service;

import com.hspedu.houserent.model.House;

/**
 * @Author:李强
 * @Date:2025/3/2
 * @Description:chapter08
 * HouseService.java <=> 类[业务层]
 * //定义House[]，保存House对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作(crud)
 */
public class HouseService {

    private House[] houses;//保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值

    public HouseService(int size) {
        //new Houses
        houses = new House[size];//当创建HouseService对象，指定数组大小
        //为了配合测试列表信息，初始化一个house对象
        houses[0] = new House(1, "测试房", "138", "江南", 2000, "未出租");
    }

    //findById方法，返回House对象或者null
    public House findById(int findId) {

        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    //del方法，删除一个房屋信息
    public boolean del(int delId) {

        //应当先找到要删除的房屋信息对应的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {//要删除的房屋对应的id，在数组下标为i的元素
                index = i;//就使用index记录i
            }
        }

        if (index == -1) {//说明delId在数组中不存在()
            return false;
        }

        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];//将index下标的元素和index+1下标的元素对调
        }
        houses[--houseNums] = null;
        return true;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加(我们暂时不考虑数组扩容的问题)
        if (houseNums == houses.length) {
            System.out.println("数组已满，不能再添加了。。。");
            /* House[] newHouses = new House[houses.length + 1];
            for (int i = 0; i < houses.length; i++) {
                newHouses[i] = houses[i];
            }
            houses = newHouses; */
            return false;
        }

        //把newHouse对象加入到，新增加了一个房屋
        houses[houseNums++] = newHouse;
        //我们程序员需要设计一个id自增长的机制，然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    //list方法，返回house
    public House[] list() {
        return houses;
    }
}
