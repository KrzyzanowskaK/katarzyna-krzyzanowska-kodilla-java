package com.kodilla.rps;

import java.util.Scanner;

public class Menu {


    public String instruction() {
        return "Instructions: Key 1 - rock Key 2 - paper Key 3 - scissors Key x - end of game Key n - new game";
    }

    /*public int endingScore (Scanner scanner) {
        boolean endingScoreValid = true;
        int howManyWins = 0;
        while (endingScoreValid) {
            try {
                howManyWins = scanner.nextInt();
                if (howManyWins > 0) {
                    endingScoreValid = false;
                } else {
                    System.out.println("Number must be greater than zero");
                }
            } catch (NumberFormatException num) {
                System.out.println("Please select integer number");
            }
        }
        return howManyWins;
    }*/

    public boolean playAgain(Scanner scanner){
        System.out.println("Do You want to play a new game (n) or end (x) ?");
        switch (scanner.next()){
            case "n":
                return areYouSure(scanner);
            case "x" :
                System.out.println("Thank you for playing!");
            default:
                break;
        }
        return false;
    }

    public boolean areYouSure(Scanner scanner){
        System.out.println("Are You sure y/n?");
        switch (scanner.next()){
            case "y" :
                Game game = new Game();
                game.start();
                return true;
            case "n":
                return playAgain(scanner);
            default:
                break;
        }
        return false;
    }

    public void checkScore(String userName, int userScore, int computerScore){
        System.out.println(userName + " " + userScore + " vs Computer: " + computerScore);
    }


}
