package com.hspedu.qqcommon;

import java.io.Serializable;

/**
 * @Author:李强
 * @Date:2025/8/5
 * @Description:QQServer 表示一个用户/客户信息
 */

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;//用户Id/用户名
    private String password;//用户密码

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
