import java.util.Scanner;

public class oef6_4_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een woord met een T en een E erin: ");
		String zin = scan.nextLine() + " ";
		int i = 0;
		while (!zin.substring(i, i + 1).equalsIgnoreCase("e") && !zin.substring(i, i + 1).equalsIgnoreCase("t")
				&& i < zin.length() - 1) {
			i++;
		}
		if (i == zin.length() - 1) {
			System.out.println("Gelieve een betere zin te geven.");
		} else {
			System.out.println("De eerste letter die voorkomt is een " + zin.substring(i, i + 1).toUpperCase());
		}
		scan.close();

	}
}
