import java.util.Scanner;

public class oef1_2 {
	public static void main(String[] args) {
		Scanner scan = makeScanner();
		System.out.println("Geef leeftijd Man");
		System.out.println(leeftijdVrouwBerekenen(scan.nextInt()));
	}

	private static double leeftijdVrouwBerekenen(int leeftijd) {
		return leeftijd / 2D + 7D;
	}

	private static Scanner makeScanner() {
		return new Scanner(System.in);
	}
}
