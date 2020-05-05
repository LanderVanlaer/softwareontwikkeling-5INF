import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class oef6_4_1 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(new File("graden.txt")));
		int graden = -40;
		while (graden <= 40) {
			if (String.valueOf(graden).length() <= 1) {
				pw.println(graden + "°C			" + (9 / 5) * graden + 32 + "°F");
			} else {

				pw.println(graden + "°C		" + (9 / 5) * graden + 32 + "°F");
			}
			graden -= -5;
		}

		pw.close();
	}
}
