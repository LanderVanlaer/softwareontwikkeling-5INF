package basic.trim1.forLoop;

import java.util.Scanner;

public class oef7_11_extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Geef een getal: ");
        Integer n = scan.nextInt();
        while(n <= 0 || n == null) {
            System.out.print("Geef een getal: ");
            n = scan.nextInt();
        }

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < n - i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        scan.close();
    }
}
