package basic.trim1.inputAndOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef3_3_4 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("src/basic/trim1/inputAndOutput/resultaten.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(new File("src/basic/trim1/inputAndOutput/oef3_3_4_results.txt")));
        pw.print("Leerling\t\tGemiddelde");
        pw.println();
        while(scan.hasNext()) {
            String naam = scan.next();
            while(!scan.hasNextDouble()) {
                naam += " " + scan.next();
            }

            pw.print(naam);

            //extra tab wanneer lengte van naam kleiner is dan 8 karakters voor uitlijning
            if(naam.length() < 8) pw.print("\t");

            double totaal = 0;
            int aantal = 0;
            while(scan.hasNextDouble()) {
                ++aantal;
                totaal += scan.nextDouble();
            }
            totaal /= aantal;
            pw.print("\t\t" + totaal);
            pw.println();
        }
        pw.close();
        scan.close();

    }
}