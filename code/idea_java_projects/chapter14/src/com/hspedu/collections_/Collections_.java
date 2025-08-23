package com.hspedu.collections_;

import java.util.*;

/**
 * @Author:李强
 * @Date:2025/4/20
 * @Description:chapter14
 */

public class Collections_ {
    public static void main(String[] args) {
        //创建ArrayList 集合，用于测试
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");

        //reverse(list)：反转List中元素的顺序
        Collections.reverse(list);
        //shuffle(List)：对List集合元素进行随机排序
        Collections.shuffle(list);
        //sort(List)：根据元素的自然顺序对指定List集合元素按升序排序
        Collections.sort(list);
        //sort(List，Comparator)：根据指定的Comparator产生的顺序对List集合元素进行排序
        // 按照字符串的大小排序
        Collections.sort(list, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                //可以加入校验代码
                //if (o1 instanceof String)
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        //swap(List，int，int)：将指定list集合中的i处元素和j处元素进行交换
        Collections.swap(list, 0, 1);

        //Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println("自然顺序最大元素=" + Collections.max(list));
        //Object max(Collection，Comparator)：根据Comparator指定的顺序，返回给定集合中的最大元素
        //返回长度最大的元素
        Object max = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println(max);
        //Object min(Collection)
        //Object min(Collection，Comparator)
        //int frequency(Colleciton，Object)：返回指定集合中指定元素的出现次数
        System.out.println("tom出现的次数=" + Collections.frequency(list, "tom"));
        //void copy(List dest，List src)：将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        //为了完成一个完整拷贝，需要先给dest赋值，大小和list.size()一样
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest, list);
        //boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换List对象的所有旧值
        Collections.replaceAll(list, "tom", "汤姆");
    }
}
