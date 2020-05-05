package basic.trim1.forLoop;

import java.util.Scanner;

public class oef7_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Geef uw naam, leeftijd, jaarlijkse salaris: ");
        String[] antwoord = scan.nextLine().split(",");
        String naam = antwoord[0].trim();
        int leeftijd = Integer.valueOf(antwoord[1].trim());
        double salaris = Double.valueOf(antwoord[2].trim());
        double totaal = salaris;
        for(int i = leeftijd; i <= 65; i -= -1) {
            salaris *= 1.03;
            totaal += salaris;
        }

        System.out.println(naam + " zal ongeveer " + Math.round(totaal * 100) / 100 + " € verdiend hebben.");
    }
}
