import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class oef8_2_7 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(new File("array.txt")));
		double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		double[] arrayInvert = new double[array.length];
		double[] arrayGemiddelde = new double[array.length];
		for (int i = 0; i < array.length; ++i) {
			arrayInvert[(array.length - 1) - i] = array[i];
		}
		for (int i = 0; i < array.length; i++) {
			arrayGemiddelde[i] = (array[i] + arrayInvert[i]) / 2;
		}
		for (int i = 0; i < array.length; i++) {
			pw.println(array[i] + "		" + arrayInvert[i] + "		" + arrayGemiddelde[i]);
		}
		pw.close();
	}
}
