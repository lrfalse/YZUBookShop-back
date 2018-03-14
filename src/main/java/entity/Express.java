package com.example.xmfy.yzubookshop.model;

/**
 * Created by xmfy on 2018/3/11.
 */

public class Express {
    private String orderGroup;
    private String seller;
    private String buyer;
    private String expressName;
    private String expressId;

    public Express() {
    }

    public Express(String orderGroup, String seller, String buyer, String expressName, String expressId) {
        this.orderGroup = orderGroup;
        this.seller = seller;
        this.buyer = buyer;
        this.expressName = expressName;
        this.expressId = expressId;
    }

    public String getOrderGroup() {
        return orderGroup;
    }

    public void setOrderGroup(String orderGroup) {
        this.orderGroup = orderGroup;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    @Override
    public String toString() {
        return "Express{" +
                "orderGroup='" + orderGroup + '\'' +
                ", seller='" + seller + '\'' +
                ", buyer='" + buyer + '\'' +
                ", expressName='" + expressName + '\'' +
                ", expressId='" + expressId + '\'' +
                '}';
    }
}
