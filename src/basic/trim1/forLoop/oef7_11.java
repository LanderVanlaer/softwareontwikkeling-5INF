package basic.trim1.forLoop;

import java.util.Scanner;

public class oef7_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Geef een getal: ");
        Integer n = scan.nextInt();
        while(n <= 0 || n == null) {
            System.out.print("Geef een getal: ");
            n = scan.nextInt();
        }
        String zin = "";
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                zin += " *";
            }
            System.out.println(zin);
            zin = "";
        }
        for(int i = n; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                zin += " *";
            }
            System.out.println(zin);
            zin = "";
        }
        scan.close();
    }
}
