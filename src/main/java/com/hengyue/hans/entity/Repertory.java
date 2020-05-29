package com.hengyue.hans.entity;

/**
 * 库存产品
 * @author 章家宝
 */
public class Repertory {

    private Integer id;

    private String name;

    private Integer money;

    private Integer nowMoney;

    private String remarks;

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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getNowMoney() {
        return nowMoney;
    }

    public void setNowMoney(Integer nowMoney) {
        this.nowMoney = nowMoney;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Repertory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", nowMoney=" + nowMoney +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
