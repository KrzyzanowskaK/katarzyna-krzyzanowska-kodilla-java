package com.kodilla.patterns.builder.bigmac;

public class Ingredient {
    private final String salad  = "salad";
    private final String onion = "onion";
    private final String bacon = "bacon";
    private final String cucumbers = "cucmbers";
    private final String chiliPeppers = "chili peppers";
    private final String mushrooms = "mushrooms";
    private final String shrimps = "shrimps";
    private final String cheese = "cheese";
    private String ingredient = "";

    public Ingredient(String ingredient) {
        if (ingredient.equals(salad) ||
                ingredient.equals(onion) ||
                ingredient.equals(bacon) ||
                ingredient.equals(cucumbers) ||
                ingredient.equals(chiliPeppers) ||
                ingredient.equals(mushrooms) ||
                ingredient.equals(shrimps) ||
                ingredient.equals(cheese)) {
            this.ingredient = ingredient;
        }
    }

    @Override
    public String toString() {
        return ingredient;
    }
}
