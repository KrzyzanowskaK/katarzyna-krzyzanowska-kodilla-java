package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProcessOrder {
    public void retrieve(Order order) {
        Customer customer = order.getCustomer();

        System.out.println("Zamówienie klienta " + customer.getName() + " " + customer.getLastName());

        System.out.println("Procesowanie zamówienia...");
        order.getOrdersItem().forEach(v -> {
            System.out.println("Produkt: " + v.getProduct() + " został zamówiony w ilości: " + v.getQuantity());
        });
    }

    /*private  Producer producer;

    public ProcessOrder(Producer producer) {
        this.producer = producer;
    }

    public Order process(Order order) {
        producer.process(order.getProduct());
        return order;
    }*/
}
