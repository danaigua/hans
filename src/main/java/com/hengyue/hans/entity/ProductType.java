package com.hengyue.hans.entity;

/**
 * 产品类别实体
 * @author 章家宝
 */
public class ProductType {

    /**
     * 唯一编号
     */
    private Integer id;

    /**
     * 父节点
     */
    private Integer parentId;

    /**
     * 图标
     */
    private String icon;

    /**
     * 名称
     */
    private String name;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 型号
     */
    private String model;

    @Override
    public String toString() {
        return "ProductType{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", icon='" + icon + '\'' +
                ", name='" + name + '\'' +
                ", state=" + state +
                ", model='" + model + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
