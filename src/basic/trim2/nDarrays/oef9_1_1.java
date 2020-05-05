import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oef9_1_1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("oef9_1_1.txt"));
		String[][] data = new String[4][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = scan.next();
			}
			scan.nextLine();
		}

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
