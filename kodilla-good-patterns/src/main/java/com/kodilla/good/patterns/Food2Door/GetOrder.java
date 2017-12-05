package com.kodilla.good.patterns.Food2Door;

public class GetOrder {
    public Order retrieve() {
        Product product1 = new Product("Apple",2.5,true);
        double quantity = 2.0;
        Customer customer1 = new Customer("Ann","Green");
        return new Order(product1,quantity,customer1);
    }
}
