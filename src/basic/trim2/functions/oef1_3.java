package basic.trim2.functions;

import java.util.Scanner;

public class oef1_3 {
    public static void main(String[] args) {
        Scanner scan = makeScanner();
        System.out.println(leeftijdManBerekenen(scan.nextDouble()));
    }

    private static double leeftijdManBerekenen(double leeftijd) {
        return (leeftijd - 7D) * 2D;
    }

    private static Scanner makeScanner() {
        return new Scanner(System.in);
    }
}
