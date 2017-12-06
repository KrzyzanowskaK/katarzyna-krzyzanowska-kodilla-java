package com.kodilla.good.patterns.Food2Door;

public class OrderItem {
    private Product product;
    private long quantity;

    public OrderItem(Product product, long quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public long getQuantity() {
        return quantity;
    }
}
