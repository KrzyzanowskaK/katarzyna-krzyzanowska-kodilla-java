package com.kodilla.good.patterns.challenges;

public class OrderServiceProduct implements OrderService {
    public boolean order(User user, Product product){
        System.out.println("Dear " + user + ", you ordered: " + product + ".");
        return true;
    }
}
