package com.kodilla.good.patterns.challenges;

public class OrderRepositoryConfirmation implements OrderRepository {
    public boolean createOrder(User user, Product product){
        System.out.println("Order is successful. You will soon receive: " + product + ".");
        return true;
    }
}
