package com.hspedu.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author:李强
 * @Date:2025/8/20
 * @Description:chapter23
 */

public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<?> fileClass = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("File构造器=" + declaredConstructor);
        }
        //指定构造器创建File对象
        Constructor<?> constructor = fileClass.getConstructor(String.class);
        Object o = constructor.newInstance("E:\\mynew.txt");
        Method createNewFile = fileClass.getMethod("createNewFile");
        createNewFile.invoke(o);

    }
}
