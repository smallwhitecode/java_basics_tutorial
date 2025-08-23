package com.hspedu.properties_;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @Author:李强
 * @Date:2025/6/27
 * @Description:chapter19
 */

public class Properties01 {

    //传统的方法
    @Test
    public void traditionRead() throws IOException {
        //读取mysql.properties 文件，并得到ip，user和pwd
        BufferedReader br = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] split = line.split("=");
            //如果我们要求指定的值
            if("user".equals(split[0])) {
                System.out.println("用户名=" + split[1]);
            }
            if("password".equals(split[0])) {
                System.out.println("密码=" + split[1]);
            }
        }
        br.close();
    }

    @Test
    public void propertiesRead() throws IOException {
        //1. 创建Properties 对象
        Properties properties = new Properties();
        //2. 加载指定配置文件
        properties.load(new FileReader("src\\mysql.properties"));
        //3. 把k-v显示控制台
        properties.list(System.out);
        //4. 根据key获取对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("password");
        System.out.println("用户名=" + user);
        System.out.println("密码是=" + pwd);
    }

    @Test
    public void insertProperties() throws IOException {
        Properties properties = new Properties();
        //添加
        properties.setProperty("test","123");
        properties.setProperty("user", "汤姆");//保存时，是中文的unicode 码值
        properties.store(new FileWriter("src//mysql2.properties"), null);
        //properties.store(new FileOutputStream("src//mysql2.properties"),null);
        System.out.println("保存配置文件成功~");
        //读取
        Properties properties2 = new Properties();
        properties2.load(new FileReader("src//mysql2.properties"));
        properties2.list(System.out);
        //修改
        properties2.setProperty("test","456");
        properties2.store(new FileWriter("src//mysql2.properties"),"测试一下下");
        System.out.println("修改成功~");
    }
}
