import java.util.Arrays;

public class oef8_2_5 {
	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 3, 4, 5, 6 };
		int[] numbers2 = { 0, 2, 3, 4, 5, 6 };
		System.out.println("De 2 arrays zijn " + (Arrays.equals(numbers1, numbers2) ? "gelijk" : "niet gelijk"));
	}
}
