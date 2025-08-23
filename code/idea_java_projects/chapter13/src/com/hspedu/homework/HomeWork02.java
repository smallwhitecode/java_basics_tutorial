package com.hspedu.homework;

/**
 * @Author:李强
 * @Date:2025/4/2
 * @Description:chapter13
 */

public class HomeWork02 {
    public static void main(String[] args) {
        String name = "jack";
        String password = "123456";
        String email = "jack@sohu.com";

        try {
            userRegister(name, password, email);
            System.out.println("恭喜你，注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void userRegister(String username, String password, String email) {
        if (!(username.length() >= 2 && username.length() <= 4)) {
            throw new RuntimeException("用户名长度错误");
        }
        if (!(password.length() == 6 && isDigital(password))) {
            throw new RuntimeException("密码错误");
        }
        int i = email.indexOf('@');
        int i1 = email.indexOf('.');
        if (!(i > 0 && i1 > i)) {
            throw new RuntimeException("邮箱格式有错");
        }
    }

    public static boolean isDigital(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars) {
            if (c < '0'|| c > '9') {
                return false;
            }
        }
        return true;
    }
}
