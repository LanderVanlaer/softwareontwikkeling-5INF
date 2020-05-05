import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class oef6_4_4 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(new File("oef6_4_4.txt")));
		int jaar = 1999;
		long bevolking = 120000000;
		while (bevolking > 60000l) {
			bevolking = bevolking / 2l;
			pw.println(jaar + "		" + bevolking);
			jaar -= 40;
		}
		pw.close();
	}
}
