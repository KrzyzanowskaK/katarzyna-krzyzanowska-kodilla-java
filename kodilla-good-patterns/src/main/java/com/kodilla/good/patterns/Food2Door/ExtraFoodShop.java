package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Producer {
    private List<Product> product = new ArrayList();

    public ExtraFoodShop(List<Product> product) {
        this.product = product;
    }

    @Override
    public void process(Product product) {
        if (product.getAvailable()) {
            System.out.println("Order from Extra Food Shop: " + product.getName() + ". Price (per item): " +
                    product.getPrice() + " PLN.");
        } else {
            System.out.println("Sorry, product not available.");
        }
    }
}
