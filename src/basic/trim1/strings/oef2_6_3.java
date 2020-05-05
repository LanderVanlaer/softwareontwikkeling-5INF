package basic.trim1.strings;

import java.util.Scanner;

public class oef2_6_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner intialiseren
        System.out.print("Geef een kommagetal: ");
        String getal = scan.nextLine().toUpperCase();
        if(getal.indexOf(".") == -1) {
            System.out.print("Dat is geen kommagetal!!!");
            return;
        }
        String[] splitGetal = getal.split("\\.");
        System.out.println("Het getal voor het punt is " + splitGetal[0].length() + " lang, het getal na het punt is "
                + splitGetal[1].length() + " lang.");
    }
}