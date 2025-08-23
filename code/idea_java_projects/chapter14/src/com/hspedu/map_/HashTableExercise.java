package com.hspedu.map_;

import java.util.Hashtable;

/**
 * @Author:李强
 * @Date:2025/4/20
 * @Description:chapter14
 */

public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("john", 100);
        table.put(null, 100);//异常NullPointerException
        table.put("john", null);//异常NullPointerException
        table.put("lucy", 100);
        table.put("lic", 100);
        table.put("lic", 88);//替换
        System.out.println(table);

        //简单说明一下Hashtable的底层
        //1、底层有数组 Hashtable$Entry[] 初始化大小为11
        //2、临界值 threshold 8 = 11*0.75
        //3、扩容 按照自己的扩容机制来进行即可
        //4、执行 方法 addEntry(hash，key，value，index)；添加K-V 封装到Entry
        //5、if (count >= threshold) 满足时，就进行扩容
        //5、按照 int newCapacity = (oldCapacity << 1) + 1;的大小扩容
    }
}
