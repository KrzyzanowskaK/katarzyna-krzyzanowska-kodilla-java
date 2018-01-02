package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    private final String standard = "Standard";
    private final String thousandIslands = "1 000 Islands";
    private final String barbecue = "Barbeque";
    private String sauceType = "";

    public Sauce(String sauceType) {
        if (sauceType.equals(standard) ||
                sauceType.equals(thousandIslands) ||
                sauceType.equals(barbecue)) {
            this.sauceType = sauceType;
        }
    }

    @Override
    public String toString() {
        return sauceType;
    }
}