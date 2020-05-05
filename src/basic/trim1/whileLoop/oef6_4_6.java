package basic.trim1.whileLoop;

import java.util.Scanner;

public class oef6_4_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int getal = 0;
        int som = 0;
        do {
            som += getal;
            System.out.print("Geef een getal: ");
            getal = scan.nextInt();
        } while(getal != -1);
        System.out.println(som);
    }
}
