package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.4, 4.4);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } finally {
            System.out.println("End of operation.");
        }

    }
}
