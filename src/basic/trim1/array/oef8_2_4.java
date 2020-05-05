public class oef8_2_4 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1,
				2, 2, 1, 5, 3, 7, 3, 1, 0 };
		for (int i = 0; i < 10; i++) {
			int aantal = 0;
			for (int j : numbers) {
				if (i == j) {
					++aantal;
				}
			}
			System.out.println("Het getal \"" + i + "\" komt " + aantal + " keer voor.");
		}
	}
}
