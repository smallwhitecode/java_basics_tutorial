package com.hspedu.homework;

import java.util.*;

/**
 * @Author:李强
 * @Date:2025/4/20
 * @Description:chapter14
 */

public class HomeWork03 {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("jack", 650);// int ->Integer
        m.put("tom", 1200);
        m.put("smith", 2900);
        System.out.println(m);

        m.put("jack", 2600);

        Set set = m.keySet();
        for (Object key : set) {
            m.put(key, (Integer) m.get(key) + 100);
        }

        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry e = (Map.Entry) iterator.next();
            System.out.println(e.getKey() + "-" + e.getValue());
        }

        Collection values = m.values();

    }
}
