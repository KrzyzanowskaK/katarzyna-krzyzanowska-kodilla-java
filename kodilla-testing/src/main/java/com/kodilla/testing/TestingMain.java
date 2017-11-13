package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args){

        Calculator calc = new Calculator();

        int addResult = calc.addAtoB(5,3);
        int subtractResult = calc.subtractAfromB(5,3);

        System.out.println(addResult==5+3 ? "Add OK" : "Error");

        System.out.println(subtractResult==5-3 ? "Subtract OK" : "Error");
    }
}