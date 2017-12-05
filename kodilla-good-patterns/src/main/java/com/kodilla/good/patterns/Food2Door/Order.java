package com.kodilla.good.patterns.Food2Door;

public class Order {
    private Product product;
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
    }
}
