package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        OrderPizza order = new BasicPizza();

        //When
        BigDecimal cost = order.getCost();

        //Then
        assertEquals(new BigDecimal(25), cost);

    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        OrderPizza order = new BasicPizza();

        //When
        String description = order.getDescription();

        //Then
        assertEquals("You ordered pizza", description);
    }

    @Test
    public void testBasicPizzaOrderWithCola() {
        //Given
        OrderPizza order = new BasicPizza();
        order = new PizzaWithColaDecorator(order);

        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();

        //Then
        assertEquals(new BigDecimal(30), cost);
        assertEquals("You ordered pizza + cola 1L", description);
    }

    @Test
    public void testBasicPizzaOrderPanWithToppingsColaTakeAway() {
        //Given
        OrderPizza order = new BasicPizza();
        order = new PizzaPanDecorator(order);
        order = new PizzaWithToppings(order);
        order = new PizzaWithColaDecorator(order);
        order = new PizzaTakeAwayDecorator(order);

        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();

        //Then
        assertEquals(new BigDecimal(43.5), cost);
        assertEquals("You ordered pizza + pan + mushrooms + ham + cheese + cola 1L + take away box", description);
    }
}
