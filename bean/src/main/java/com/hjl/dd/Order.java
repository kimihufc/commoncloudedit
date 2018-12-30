package com.hjl.dd;

/**
 * @author: HJL
 * @create: 2018-12-30 14:14
 */
public class Order {

    /**
     * 主键
     */
    private Integer id;
    /**
     * 订单名称
     */
    private String name;
    /**
     * 订单价格
     */
    private String price;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
