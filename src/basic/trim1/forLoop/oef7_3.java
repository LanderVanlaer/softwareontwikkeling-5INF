package basic.trim1.forLoop;

import java.util.Scanner;

public class oef7_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int zijde;
        do {
            System.out.print("Geef een getal tussen 2 en 10: ");
            zijde = scan.nextInt();
        } while(zijde <= 0 || zijde > 10);

        // draw
        String bovenOnder = "";
        for(int i = 0; i < zijde; i++) {
            bovenOnder += " *";
        }
        System.out.println(bovenOnder);
        String middel = "";
        for(int i = 0; i < zijde - 2; i++) {
            middel += "  ";
        }

        for(int i = 0; i < zijde - 2; i++) {
            System.out.println(" *" + middel + " *");
        }
        if(zijde != 1) {
            System.out.println(bovenOnder);
        }
    }
}
