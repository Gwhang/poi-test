package com.example.poitest.pojo;

import com.example.poitest.annotation.Excel;

/**
 * 用户实体类
 */
public class User {

    @Excel(name = "用户编号")
    private Integer id;
    @Excel(name="用户名称")
    private String userName;
    @Excel(name="用户密码")
    private String passWord;
    @Excel(name="用户实名")
    private String realName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
