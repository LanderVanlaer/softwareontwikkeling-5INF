import java.util.Scanner;

public class oef7_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een zin: ");
		int n = scan.nextInt();
		int totaal = 0;
		System.out.println();
		if (scan.next().equalsIgnoreCase("y"))
			for (int i = 0; i < n; i++) {
				totaal += i;
			}
		System.out.println(totaal);
	}
}
