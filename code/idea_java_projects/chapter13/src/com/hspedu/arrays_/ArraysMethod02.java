package com.hspedu.arrays_;

import java.util.Arrays;

/**
 * @Author:李强
 * @Date:2025/3/31
 * @Description:chapter13
 */

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 90, 123, 567};
        //binarySearch 通过二分搜索法进行查找，要求必须排好序
        //1、使用 binarySearch 二叉查找
        //2、要求数组是有序的。如果该数组是无序的，不能使用binarySearch
        int index = Arrays.binarySearch(arr, 123);
        System.out.println("index=" + index);

        //copyOf 数组元素的复制
        //1、从arr数组中，拷贝arr.length 个元素到newArr数组中
        //2、如果拷贝的长度 > arr.length 就在新数组的后面 增加null
        Integer[] newArr = Arrays.copyOf(arr, arr.length + 1);
        System.out.println("==拷贝执行完毕后==");
        System.out.println(Arrays.toString(newArr));
    }
}
