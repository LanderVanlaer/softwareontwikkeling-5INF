import java.util.Scanner;

public class oef7_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef het aantal dagen: ");
		int aantalDagen = scan.nextInt();
		int totaalFor = 0;
		for (int i = 1; i <= aantalDagen; i++) {
			totaalFor += i;
		}
		String zin = "Het totaal bedrag dat u moet betalen is %d €";
		if (totaalFor > aantalDagen * 100) {
			System.out.println(String.format(zin, aantalDagen * 100));
		} else {
			System.out.println(String.format(zin, totaalFor));
		}
	}
}
