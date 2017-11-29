package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        ComputerChoice computerChoice = new ComputerChoice();
        Random random = new Random();
        System.out.println(computerChoice.generateComputerChoice(random));

        UserChoice userChoice = new UserChoice();
        Scanner scanner = new Scanner(System.in);
        System.out.println(userChoice.getUserChoice(scanner));

    }
}
