package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producer {
    private static final String SHOP_NAME = "HealthyShop";
    private List<Product> products = new ArrayList();

    public HealthyShop(List<Product> products) {
        this.products = products;
    }

    @Override
    public void process(Product product) {
        if (product.getAvailable()) {
            System.out.println("Order from Healthy Shop.");
        } else {
            System.out.println("Sorry, product not available.");
        }
    }

    @Override
    public String getProducerName() {
        return SHOP_NAME;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}

