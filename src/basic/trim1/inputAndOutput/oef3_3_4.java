import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef3_3_4 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("resultaten.txt"));
		Scanner scan2 = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new FileWriter(new File("oef3_3_4_results.txt")));
		pw.print("Leerling		Gemiddelde");
		pw.println();
		while (scan.hasNext()) {
			String naam = scan.next();
			while (!scan.hasNextDouble()) {
				naam += scan.next();
			}
			pw.print(scan.next());
			double totaal = 0;
			for (int i = 0; i < 4; i++) {
				totaal += scan.nextDouble();
			}
			totaal /= 4;
			pw.print("		" + totaal);
			pw.println();
		}
		pw.close();
		scan.close();

	}
}