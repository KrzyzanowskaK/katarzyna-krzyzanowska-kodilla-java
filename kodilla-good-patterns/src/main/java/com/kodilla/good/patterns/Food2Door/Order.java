package com.kodilla.good.patterns.Food2Door;

import java.util.List;

public class Order {
    private Customer customer;
    private List<OrderItem> ordersItem;

    public Order(Customer customer, List<OrderItem> ordersItem) {
        this.customer = customer;
        this.ordersItem = ordersItem;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getOrdersItem() {
        return ordersItem;
    }
}
