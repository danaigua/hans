package com.hengyue.hans.entity;

/**
 * 产品实体
 * @author 章家宝
 */
public class Product {
    /***
     * 唯一编号
     */
    private Integer id;


    /**
     * 名称
     */
    private String name;

    /**
     * 售价
     */
    private Integer money;

    /**
     * 现售价
     */
    private Integer trueMoney;

    /**
     * 折扣
     */
    private double discount;
    /**
     * 备注
     */
    private String remarks;

    /**
     * 类别
     */
    private Integer type;

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

    public Integer getTrueMoney() {
        return trueMoney;
    }

    public void setTrueMoney(Integer trueMoney) {
        this.trueMoney = trueMoney;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", trueMoney=" + trueMoney +
                ", discount=" + discount +
                ", remarks='" + remarks + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
