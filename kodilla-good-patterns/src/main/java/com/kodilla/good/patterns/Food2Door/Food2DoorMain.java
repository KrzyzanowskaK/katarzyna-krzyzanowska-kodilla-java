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
        noGluten.add(new Product("Eggs", 3.0,true));
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(noGluten);

        ProducerRepository repository = new ProducerRepository();
        repository.addProducer(extraFoodShop);
        repository.addProducer(healthyShop);
        repository.addProducer(glutenFreeShop);

        Customer customer = new Customer("Ann", "Green");
        OrderItem item1 = new OrderItem(new Product("Apple", 2.5, true), 2);
        List<OrderItem> itemList = new ArrayList<>();
        itemList.add(item1);

        Order order = new Order(customer, itemList);
        ProcessOrder processOrder = new ProcessOrder();
        processOrder.retrieve(order);



        /*ExtraFoodShop extraFoodShop = new ExtraFoodShop(theList);
        HealthyShop healthyShop = new HealthyShop(theList);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(theList);

        ProcessOrder processOrder1 = new ProcessOrder(extraFoodShop);
        GetOrder getOrder1 = new GetOrder();
        Order order1 = getOrder1.retrieve1();
        processOrder1.process(order1);
        System.out.println("Summary: Customer " + order1.getCustomer() + " has to pay: " + order1.getValue() + " PLN");

        ProcessOrder processOrder2 = new ProcessOrder(healthyShop);
        GetOrder getOrder2 = new GetOrder();
        Order order2 = getOrder2.retrieve2();
        processOrder2.process(order2);
        System.out.println("Summary: Customer " + order2.getCustomer() + " has to pay: " + order2.getValue() + " PLN");

        ProcessOrder processOrder3 = new ProcessOrder(glutenFreeShop);
        GetOrder getOrder3 = new GetOrder();
        Order order3 = getOrder3.retrieve3();
        processOrder3.process(order3);
        System.out.println("Summary: Customer " + order3.getCustomer() + " has to pay: " + order3.getValue() + " PLN");*/

    }
}
