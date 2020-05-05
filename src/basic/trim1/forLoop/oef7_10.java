package basic.trim1.forLoop;

import java.util.Scanner;

public class oef7_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Geef een getal: ");
        long n = scan.nextLong();
        for(int i = 2; i <= n / 2; i -= -1) {
            if(n % i == 0) {
                System.out.println(String.format("Het getal %d is geen priemgetal, het is deelbaar door %d", n, i));
                return;
            }
        }

        System.out.println(String.format("Het getal %d is een priemgetal", n));
    }
}
