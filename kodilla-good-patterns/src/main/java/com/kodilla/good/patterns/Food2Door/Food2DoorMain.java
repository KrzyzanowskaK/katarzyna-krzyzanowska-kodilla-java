package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorMain {
    public static void main (String[] args) {
        List<Product> theList = new ArrayList<>();
        theList.add(new Product("Apple", 2.5,true));
        theList.add(new Product("Cherry", 0.5,true));
        ExtraFoodShop extraFoodShop = new ExtraFoodShop(theList);

        List<Product> healthyProducts = new ArrayList<>();
        healthyProducts.add(new Product("Carrot", 2.1,true));
        healthyProducts.add(new Product("Potatoes", 5.2,true));
        HealthyShop healthyShop = new HealthyShop(healthyProducts);

        List<Product> noGluten = new ArrayList<>();
        noGluten.add(new Product("Bread", 6.5,true));
        noGluten.add(new Product("Pasta", 3.0,true));
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(noGluten);

        ProducerRepository repository = new ProducerRepository();
        repository.addProducer(extraFoodShop);
        repository.addProducer(healthyShop);
        repository.addProducer(glutenFreeShop);

        Customer customer = new Customer("Ann", "Green");
        OrderItem item1 = new OrderItem(new Product("Apple", 2.5, true), 2);
        OrderItem item2 = new OrderItem(new Product("Carrot", 2.1,true), 5);
        OrderItem item3 = new OrderItem(new Product("Pasta", 3.0,true), 20);
        List<OrderItem> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        Order order = new Order(customer, itemList);
        ProcessOrder processOrder = new ProcessOrder();
        processOrder.retrieve(order);
    }
}
