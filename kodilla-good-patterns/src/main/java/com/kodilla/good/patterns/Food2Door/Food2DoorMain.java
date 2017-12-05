package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorMain {
    public static void main (String[] args) {
        List<Product> theList = new ArrayList<>();
        theList.add(new Product("Apple", 2.5,true));
        theList.add(new Product("Cherry", 0.5,true));
        theList.add(new Product("Orange", 2.1,false));
        theList.add(new Product("Coconut", 5.2,false));
        ExtraFoodShop extraFoodShop = new ExtraFoodShop(theList);
        ProcessOrder processOrder = new ProcessOrder(extraFoodShop);
        GetOrder getOrder = new GetOrder();
        Order order = getOrder.retrieve();
        processOrder.process(order);
        System.out.println("Customer " + order.getCustomer() + " has to pay: " + order.getValue() + " PLN");
    }
}
