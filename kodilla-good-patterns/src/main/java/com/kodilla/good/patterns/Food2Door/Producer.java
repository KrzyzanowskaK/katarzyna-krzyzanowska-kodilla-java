package com.kodilla.good.patterns.Food2Door;

import java.util.List;

public interface Producer {
    void process(Product product);
    String getProducerName();
    List<Product> getProducts();
}
