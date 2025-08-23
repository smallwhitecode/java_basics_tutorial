package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author:李强
 * @Date:2025/3/31
 * @Description:chapter13
 */

public class ArraysMethod01 {
    public static void main(String[] args) {


        Integer arr[] = {1, -1, 7, 0, 89};
        //进行排序
        //1、可以直接使用冒泡排序，也可以直接使用Arrays提供的sort方法排序
        //2、因为数组是引用类型，所以通过sort排序后，会直接影响到实参arr
        //3、sort重载的，也可以通过传入一个接口 Comparator 实现定制排序
        //4、调用 定制排序 时，传入两个参数（1）排序的数组arr
        //  （2）实现了Comparator接口的匿名内部类， 要求实现compare 方法
        //Arrays.sort(arr);  //默认排序
        //定制排序
        Arrays.sort(arr, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println("===排序后");
        System.out.println(Arrays.toString(arr));

    }
}
