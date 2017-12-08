package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorMain {
    public static void main (String[] args) {
        List<Product> theList = new ArrayList<>();
        theList.add(new Product("Apple", true));
        theList.add(new Product("Cherry", true));
        ExtraFoodShop extraFoodShop = new ExtraFoodShop(theList);

        List<Product> healthyProducts = new ArrayList<>();
        healthyProducts.add(new Product("Carrot", true));
        healthyProducts.add(new Product("Potatoes", true));
        HealthyShop healthyShop = new HealthyShop(healthyProducts);

        List<Product> noGluten = new ArrayList<>();
        noGluten.add(new Product("Bread", true));
        noGluten.add(new Product("Pasta", true));
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(noGluten);

        ProducerRepository repository = ProducerRepository.getInstance();
        repository.addProducer(extraFoodShop);
        repository.addProducer(healthyShop);
        repository.addProducer(glutenFreeShop);

        Customer customer = new Customer("Ann", "Green");
        OrderItem item1 = new OrderItem(new Product("Apple",  true), 2);
        OrderItem item2 = new OrderItem(new Product("Carrot", true), 5);
        OrderItem item3 = new OrderItem(new Product("Pasta", true), 20);
        List<OrderItem> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        Order order = new Order(customer, itemList);
        ProcessOrder processOrder = new ProcessOrder();
        processOrder.retrieve(order);
    }
}