package com.hogerlager;

import java.util.Scanner;

public class Main {
    private static Scanner scan;
    private static boolean verloren = false;
    private static int winstreak = 0;
    private static Speelkaart huidigeKaart;
    private static Speelkaart nieuweKaart;
    private static BoekKaarten boek;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        boek = new BoekKaarten();
        huidigeKaart = boek.getNieuweKaart();

        System.out.println("Dit is het spel hoger lager,\n" +
                "U krijgt elke keer een nieuwe kaart en\n" +
                "u moet zeggen of de volgende kaart hoger OF lager is.\n" +
                "--> Antwoord met 'H'/'L'");

        do {
            System.out.println("Winstreak: " + winstreak);
            System.out.println("Uw huidige kaart:");
            System.out.println("\t" + huidigeKaart.getSoortString() + " " + huidigeKaart.getWaardeString());

            nieuweKaart = boek.getNieuweKaart();

            vraagAntwoord(huidigeKaart);

            ++winstreak;
            huidigeKaart = nieuweKaart;

            isGewonnen();

        } while(!verloren);
        gameOver();
    }

    public static void vraagAntwoord(Speelkaart huidigeKaart) {
        boolean waardeJuist;
        do {
            waardeJuist = true;
            System.out.print("Uw antwoord: ");
            String antwoord = scan.next();
            if(isLager(antwoord) || isHoger(antwoord)) {
                juist();
            } else if(antwoordIsLager(antwoord) || antwoordIsHoger(antwoord)) {
                System.out.println(huidigeKaart.getSoortString() + "\t" + huidigeKaart.getWaardeString());
                fout();
                verloren = true;
            } else {
                waardeJuist = false;
                System.out.println("Gelieve een juiste waarde in te geven.");
            }
        } while(!waardeJuist);
    }

    public static boolean isLager(String antwoord) {
        return (antwoordIsLager(antwoord) && huidigeKaart.getWaardeIndex() > nieuweKaart.getWaardeIndex());
    }

    public static boolean isHoger(String antwoord) {
        return (antwoordIsHoger(antwoord) && huidigeKaart.getWaardeIndex() < nieuweKaart.getWaardeIndex());
    }

    public static boolean antwoordIsHoger(String antwoord) {
        return antwoord.equalsIgnoreCase("H");
    }

    public static boolean antwoordIsLager(String antwoord) {
        return antwoord.equalsIgnoreCase("L");
    }

    public static void gameOver() {
        System.out.println("Game Over");
    }

    public static void juist() {
        System.out.println("JUIST!");
    }

    public static void fout() {
        System.out.println("FOUT!");
    }

    public static boolean isGewonnen() {
        int aantalWins = 7;
        if(winstreak == aantalWins) {
            System.out.println("Goedzo, je hebt gewonnen");
            System.out.println("Doe zo verder, je hebt een winstreak van intotaal " + winstreak);
            return true;
        }
        return false;
    }

}
