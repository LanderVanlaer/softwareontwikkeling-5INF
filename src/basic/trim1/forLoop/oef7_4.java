import java.util.Scanner;

public class oef7_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een getal: ");
		int getal = scan.nextInt();
		int uitkomst = getal;
		for (int i = 2; i < getal; i++) {
			uitkomst *= i;
		}
		System.out.println(getal + "! = " + uitkomst);
		scan.close();
	}
}
