package com.hengyue.hans.entity;

/**
 * 财务登记
 * @author 章家宝
 */
public class FinancialRegistration {

    private Integer id;

    private String name;

    private Integer money;

    private String reason;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "FinancialRegistration{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", reason='" + reason + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
