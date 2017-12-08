package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Producer {
    private static final String SHOP_NAME = "GlutenFreeShop";
    private List<Product> products = new ArrayList();

    public GlutenFreeShop(List<Product> products) {
        this.products = products;
    }

    @Override
    public void process(Product product) {
        if (product.getAvailable()) {
            System.out.println("Order from Gluten Free Shop.");
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