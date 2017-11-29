package com.kodilla.rps;

import java.util.Random;

public class ComputerChoice {

    public static String generateComputerChoice(Random random) {

        int wordNumber;
        wordNumber = random.nextInt(3)+1;
        String computerWordChoice = "";

        if(wordNumber == 1) {
            computerWordChoice = "kamień";
        } else if(wordNumber == 2) {
            computerWordChoice = "papier";
        } else if(wordNumber == 3) {
            computerWordChoice = "nożyce";
        }

        return computerWordChoice;
    }
}
