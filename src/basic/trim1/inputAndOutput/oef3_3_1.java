package basic.trim1.inputAndOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class oef3_3_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/basic/trim1/inputAndOutput/punten.txt"));
        // scan.useLocale(new Locale("n1", "BE"));
        scan.useLocale(new Locale("nl_BE"));
        while(scan.hasNext()) {
            String vak = scan.nextLine();
            double getal1 = scan.nextDouble();
            double getal2 = scan.nextDouble();
            scan.nextLine();
            System.out.println(vak + " " + ((getal1 + getal2) / 2));
        }

        scan.close();
    }
}