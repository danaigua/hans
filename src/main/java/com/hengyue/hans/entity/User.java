package com.hengyue.hans.entity;

/**
 * @author 章家宝
 */
public class User {
    /**
     * 唯一编号
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 真实姓名
     */
    private String trueName;

    /**
     * 电话号码
     * 默认用电话号码登录
     */
    private String telephone;
    /**
     * 密码
     */
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
