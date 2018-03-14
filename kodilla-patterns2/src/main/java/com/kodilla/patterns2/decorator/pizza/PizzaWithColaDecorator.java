package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithColaDecorator extends AbstractOrderPizzaDecorator {
    protected PizzaWithColaDecorator(OrderPizza orderPizza) {
        super(orderPizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + cola 1L";
    }
}
