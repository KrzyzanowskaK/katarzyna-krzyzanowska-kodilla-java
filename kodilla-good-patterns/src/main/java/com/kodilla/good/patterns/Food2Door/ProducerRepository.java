package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProducerRepository {

    private List<Producer> producerList;
    private static ProducerRepository instance = null;

    private ProducerRepository() {
        producerList = new ArrayList<>();
    }

    public static ProducerRepository getInstance() {
        if(instance == null) {
            instance = new ProducerRepository();
        }
        return instance;
    }

    public void addProducer(Producer producer) {
        this.producerList.add(producer);
    }

    public String getProducerName(Product product) {
        return product.getName();
    }

    public String getProductProducer(Product product) {
        for(Producer producer : producerList) {
            if (producer.getProducts().contains(product) ) {
                return producer.getProducerName();
            }
        }
        return null;
    }
}
