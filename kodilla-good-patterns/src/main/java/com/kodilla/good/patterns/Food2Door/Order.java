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

    /*private Product product;
    private double quantity;
    private Customer customer;

    public Order(Product product, double quantity, Customer customer) {
        this.product = product;
        this.quantity = quantity;
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getValue() {
        return product.getPrice() * quantity;
    }*/
}
