package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Producer {
    private List<Product> products = new ArrayList();

    public GlutenFreeShop(List<Product> products) {
        this.products = products;
    }

    @Override
    public void process(Product product) {
        if (product.getAvailable()) {
            System.out.println("Order from Gluten Free Shop: " + product.getName() + ". Price (per item): " +
                    product.getPrice() + " PLN.");
        } else {
            System.out.println("Sorry, product not available.");
        }
    }
}
