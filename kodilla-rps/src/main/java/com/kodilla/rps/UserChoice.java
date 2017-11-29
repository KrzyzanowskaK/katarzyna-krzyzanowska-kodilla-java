package com.kodilla.rps;

import java.util.Scanner;

public class UserChoice {

    public static String getUserChoice(Scanner scanner) {

        String userWordChoice = "";
        System.out.println("Wybierz: 1 - kamień, 2 - papier, 3 - nożyce");
        userWordChoice = scanner.nextLine();

        return userWordChoice;
    }
}
