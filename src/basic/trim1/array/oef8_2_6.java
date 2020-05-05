
public class oef8_2_6 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int count = 0;
		for (int d : numbers) {
			if (d % 2 == 0) {
				++count;
			}
		}
		System.out.println(count);
	}
}
