import java.util.Scanner;

public class oef7_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een zin: ");
		String zin = scan.nextLine().toUpperCase();
		int aantal = 0;
		for (int i = 0; i < zin.length(); i++) {
			if (zin.substring(i, i + 1).equalsIgnoreCase("S") || zin.substring(i, i + 1).equalsIgnoreCase("Z")) {
				aantal++;
			}
		}
		System.out.println(aantal);
	}
}
