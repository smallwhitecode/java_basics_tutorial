package com.hspedu.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author:李强
 * @Date:2025/4/20
 * @Description:chapter14
 */

public class TreeSet_ {
    public static void main(String[] args) {
        //TreeSet treeSet = new TreeSet();


        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //return ((String) o1).compareTo((String) o2);
                //如果按照长度大小
                int compare = 0;
                compare = ((String) o1).length() - ((String) o2).length();
                if (compare != 0) {
                    return compare;
                } else {
                    return ((String) o1).compareTo((String) o2);
                }
            }
        });

        treeSet.add("jack");
        treeSet.add("a");
        treeSet.add("tom");
        treeSet.add("sp");

        /*1、构造器把传入的比较器对象，赋给了TreeSet的底层的 TreeMap的属性this.comparator
       public TreeMap(Comparator<? super K> comparator) {
                this.comparator = comparator;
            }

           2、在调用treeSet.add("tom"),在底层会执行到
           if (cpr != null) {
            do {
                parent = t;
                //动态绑定到我们的匿名内部类(对象)compare
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else //如果相等，即返回0，这个Key就没有加入
                    return t.setValue(value);
            } while (t != null);
        }
       */
    }
}
