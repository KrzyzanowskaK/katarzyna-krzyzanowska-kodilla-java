package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(2.6, 2.6);
        double subResult = calculator.sub(4.5, 2.3);
        double mulResult = calculator.mul(1.1, 0.2);
        double divResult = calculator.div(1.6, 0.2);

        //Then
        Assert.assertEquals(5.2, addResult,0.1);
        Assert.assertEquals(2.2, subResult, 0.1);
        Assert.assertEquals(0.22, mulResult, 0.1);
        Assert.assertEquals(8.0, divResult, 0.1);
    }
}
