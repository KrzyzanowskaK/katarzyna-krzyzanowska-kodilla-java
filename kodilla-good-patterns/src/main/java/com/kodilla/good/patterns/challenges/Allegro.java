package com.kodilla.good.patterns.challenges;

public class Allegro {
    public  static void main(String[] args){
        InformationServiceRequest informationServiceRequest = new InformationServiceRequest();
        OrderServiceProduct orderServiceProduct = new OrderServiceProduct();
        OrderRepositoryConfirmation orderRepositoryConfirmation = new OrderRepositoryConfirmation();

        User user = new User("Thorin", 1212);
        Product product = new Product("Map of Shire");
        OrderRequest order = new OrderRequest(user,product);
        ProductOrderService productOrderService = new ProductOrderService(informationServiceRequest, orderServiceProduct, orderRepositoryConfirmation);
        productOrderService.process(order);
    }
}
