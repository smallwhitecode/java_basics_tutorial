package com.hspedu.map_;

import java.util.Properties;

/**
 * @Author:李强
 * @Date:2025/4/20
 * @Description:chapter14
 */

public class Properties_ {
    public static void main(String[] args) {

        //1、Properties 继承Hashtable
        //2、可以通过 k-v 存放数据  当然key和value 不能为null
        //增加
        Properties properties = new Properties();
        properties.put("john", 100);
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 80);

        System.out.println("properties=" + properties);

        //通过k  获取对应值
        System.out.println(properties.get("lic"));
        System.out.println(properties.getProperty("lic"));

        //删除
        properties.remove("lic");

        //修改
        properties.put("john", "约翰");


    }
}
