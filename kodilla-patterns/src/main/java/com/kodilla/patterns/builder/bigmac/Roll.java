package com.kodilla.patterns.builder.bigmac;

public class Roll {
    private final String withSesame = "with sesame";
    private final String withoutSesame = "without sesame";
    private String rollType = "";

    public Roll(String rollType) {
        if (rollType.equals(withSesame) ||
                rollType.equals(withoutSesame)) {
            this.rollType = rollType;
        }
    }

    @Override
    public String toString() {
        return rollType;
    }
}