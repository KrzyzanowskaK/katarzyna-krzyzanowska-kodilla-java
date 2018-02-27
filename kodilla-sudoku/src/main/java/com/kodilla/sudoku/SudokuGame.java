package com.kodilla.sudoku;

public class SudokuGame {
    public static void main(String[] args) {
        boolean gameFinished = false;

        while(!gameFinished) {
            ResolvingSudoku theGame = new ResolvingSudoku();
            gameFinished = theGame.resolveSudoku();
        }
    }
}