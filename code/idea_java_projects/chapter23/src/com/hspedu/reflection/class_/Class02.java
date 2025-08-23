package com.hspedu.reflection.class_;

import com.hspedu.Car;

import java.lang.reflect.Field;

/**
 * @Author:李强
 * @Date:2025/8/17
 * @Description:chapter23
 * 演示Class类的常用方法
 */

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        String classAllPath = "com.hspedu.Car";
        //1、获取到Car类 对应的 Class类
        //<?> 表示不确定的Java类型
        Class<?> cls = Class.forName(classAllPath);
        //2、输出cls
        System.out.println(cls);//显示cls 对象, 是哪个类的Class 对象
        System.out.println(cls.getClass());//输出cls 运行类型java.lang.Class
        //3、得到包名
        System.out.println(cls.getPackage().getName());
        //4、得到全类名
        System.out.println(cls.getName());
        //5、通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);
        //6、通过反射获取属性
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        //7、通过反射给属性赋值
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));
        //8、希望可以得到所有属性(字段)
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
    }
}
