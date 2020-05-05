import java.util.Scanner;

public class oef7_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een getal: ");
		int times = scan.nextInt();
		for (int i = 0; i < times; i++) {
			System.out.print("*");
		}

	}
}
