package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author:李强
 * @Date:2025/4/6
 * @Description:chapter14
 */

public class CollectionMethod {
    public static void main(String[] args) {

        //Collection
        List list = new ArrayList<>();
        //add:添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list=" + list);
        //remove:删除元素
        //list.remove(0);//删除第一个元素
        list.remove(true);//指定删除某个元素
        System.out.println("list=" + list);
        //contains：查找元素是否存在
        System.out.println(list.contains("jack"));//F
        //size:获取元素个数
        System.out.println(list.size());
        //isEmpty：判断是否为空
        System.out.println(list.isEmpty());//F
        //clear:清空
        list.clear();
        System.out.println("list=" + list);
        //addAll:添加多个元素
        //containsAll：查找多个元素是否都存在
        //removeAll：删除多个元素
    }
}
