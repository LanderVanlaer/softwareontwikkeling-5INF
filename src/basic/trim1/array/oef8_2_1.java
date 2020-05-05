package basic.trim1.array;

import java.util.Scanner;

public class oef8_2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double max;
        double min;
        double gemiddelde = 0;
        System.out.print(
                "Geef de namen van de leerlingen in, gescheiden door een puntkomma \";\" en het punt erachter weergeven door een komma \",\".\n"
                        + "bv: Tom,5;Ivo,3;Jos7 :");
        String[] names = scan.nextLine().split(";");
        double[] punten = new double[names.length];
        for(int i = 0; i < names.length; i++) {
            names[i] = names[i].trim();
            punten[i] = Double.valueOf(names[i].split(",")[1]);
            names[i] = names[i].split(",")[0];
        }
        max = punten[0];
        min = punten[0];
        for(double d : punten) {
            max = d > max ? d : max;
            min = d < min ? d : min;
            gemiddelde += d;
        }
        gemiddelde /= punten.length;
        System.out
                .println("Het gemiddelde is " + gemiddelde + ", het minimum is " + min + " en het maxiumum is " + max);
    }
}
