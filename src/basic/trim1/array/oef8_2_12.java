
public class oef8_2_12 {
	public static void main(String[] args) {
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String[] steden = { "Brugge", "Bergen", "Brussel", "Gent", "Antwerpen", "Bornem", "Luik", "Combien",
				"Oostende" };

		for (int i = 0; i < steden.length - 1; i++) {
			for (int j = 0; j <= (steden.length - 2 - i); j++) {
				int charI = -1;
				do {
					++charI;
					if (steden[j].toLowerCase().charAt(charI) > steden[j + 1].toLowerCase().charAt(charI)) {
						String temp = steden[j];
						steden[j] = steden[j + 1];
						steden[j + 1] = temp;
					}
				} while (steden[j].toLowerCase().charAt(charI) == steden[j + 1].toLowerCase().charAt(charI));
			}
		}
		for (int i = 0; i < steden.length; i++) {
			System.out.println(steden[i]);
		}
	}
}
