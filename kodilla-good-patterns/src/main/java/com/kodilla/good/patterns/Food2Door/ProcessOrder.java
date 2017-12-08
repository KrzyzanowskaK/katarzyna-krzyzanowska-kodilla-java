package com.kodilla.good.patterns.Food2Door;

public class ProcessOrder {
    public void retrieve(Order order) {
        Customer customer = order.getCustomer();
        System.out.println("Zamówienie klienta " + customer.getName() + " " + customer.getLastName());
        System.out.println("Procesowanie zamówienia...");

        ProducerRepository producerRepository = ProducerRepository.getInstance();

        for (OrderItem orderItem : order.getOrdersItem()) {
            Product product = orderItem.getProduct();
            System.out.println("Produkt: " + product.getName() + " został zamówiony w ilości: " + orderItem.getQuantity() + " u dostawcy " + producerRepository.getProductProducer(product));
            producerRepository.getProductProducer(orderItem.getProduct());
        }
    }
}
