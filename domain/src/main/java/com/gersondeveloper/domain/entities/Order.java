package com.gersondeveloper.domain.entities;

import java.util.List;

public class Order {
    //I could use Lombok here, but I will prefer to define all manually
    //to keep a simple plain pojo class without dependencies
    private int orderId;
    private int OrderCode;
    private int ClientCode;
    private List<Item> itemList;

    public Order(int orderCode, int clientCode, List<Item> itemList) {
        OrderCode = orderCode;
        ClientCode = clientCode;
        this.itemList = itemList;
    }

    public Order(){}

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderCode() {
        return OrderCode;
    }

    public void setOrderCode(int orderCode) {
        OrderCode = orderCode;
    }

    public int getClientCode() {
        return ClientCode;
    }

    public void setClientCode(int clientCode) {
        ClientCode = clientCode;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
