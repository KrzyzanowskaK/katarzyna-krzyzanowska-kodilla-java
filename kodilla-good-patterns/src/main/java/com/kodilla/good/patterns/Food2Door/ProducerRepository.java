package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProducerRepository {
    private List<Producer> producerList = new ArrayList<>();

    public void addProducer(Producer producer) {
        this.producerList.add(producer);
    }

    public String getProducerName(Product product) {
        producerList.stream().map(v -> v.getProductsList()).flatMap(p -> p.stream()).filter(x -> x.getName().equals(product.getName())).findFirst().getName();
    }
}
