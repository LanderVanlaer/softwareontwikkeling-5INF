package basic.trim1.inputAndOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef3_3_3 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("src/basic/trim1/inputAndOutput/saldo.txt"));
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File("src/basic/trim1/inputAndOutput/text.txt")));
        printWriter.print("Rekeningnummer		Nieuw Saldo");
        printWriter.println();
        while(scan.hasNext()) {
            String rekeningnummer = scan.next().trim();
            double vorigSaldo = scan.nextDouble();
            double storting = scan.nextDouble();
            double afhalingen = scan.nextDouble();
            printWriter.print(rekeningnummer);
            printWriter.print("		");
            printWriter.print(vorigSaldo + storting - afhalingen);
            printWriter.println();
        }

        scan.close();
        printWriter.close();
    }
}