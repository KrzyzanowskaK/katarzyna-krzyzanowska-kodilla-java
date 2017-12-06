package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProducerRepository {
    private List<Producer> producerList = new ArrayList<>();

    public void addProducer(Producer producer) {
        this.producerList.add(producer);
    }
}
