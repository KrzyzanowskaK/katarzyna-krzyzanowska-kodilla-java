package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigMac = new Bigmac.BigmacBuilder()
                .roll(new Roll("without sesame"))
                .burgers(2)
                .sauce(new Sauce("THOUSAND ISLANDS"))
                .ingredient(new Ingredient("bacon"))
                .ingredient(new Ingredient("mushrooms"))
                .ingredient(new Ingredient("cheese"))
                .build();
        //When
        int ingredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(3, ingredients);
        System.out.println(bigMac);
    }
}