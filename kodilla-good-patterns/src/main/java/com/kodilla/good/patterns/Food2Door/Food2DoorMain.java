package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorMain {
    public static void main (String[] args) {
        List<Product> theList = new ArrayList<>();
        theList.add(new Product("Apple", 2.5,true));
        theList.add(new Product("Cherry", 0.5,true));
        theList.add(new Product("Orange", 2.1,true));
        theList.add(new Product("Coconut", 5.2,false));
        ExtraFoodShop extraFoodShop = new ExtraFoodShop(theList);

        ProducerRepository repository = new ProducerRepository();
        repository.addProducer(extraFoodShop);



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
