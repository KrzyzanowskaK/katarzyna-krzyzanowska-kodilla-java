package com.kodilla.rps;

public class Menu {

    public static void nameAndRoundMenu() {
        System.out.println("Podaj imię: ");
        System.out.println("Podaj liczbę rund: ");
    }

    public static void explanationMenu() {
        System.out.println("klawisz 1 - zagranie \"kamień\"");
        System.out.println("klawisz 2 - zagranie \"papier\"");
        System.out.println("klawisz 3 - zagranie \"nożyce\"");
        System.out.println("klawisz x - zakończenie gry");
        System.out.println("klawisz n - uruchomienie gry od nowa");
    }
}
