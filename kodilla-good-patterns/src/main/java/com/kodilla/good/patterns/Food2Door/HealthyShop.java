package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producer {
    private List<Product> products = new ArrayList();

    public HealthyShop(List<Product> products) {
        this.products = products;
    }

    @Override
    public void process(Product product) {
        if (product.getAvailable()) {
            System.out.println("Order from Healthy Shop: " + product.getName() + ". Price (per item): " +
                    product.getPrice() + " PLN.");
        } else {
            System.out.println("Sorry, product not available.");
        }
    }
}

