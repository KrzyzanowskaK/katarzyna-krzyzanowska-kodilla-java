package com.kodilla.good.patterns.Food2Door;

public class ProcessOrder {
    private  Producer producer;

    public ProcessOrder(Producer producer) {
        this.producer = producer;
    }
    public Order process(Order order) {
        producer.process(order.getProduct());
        return order;
    }
}
