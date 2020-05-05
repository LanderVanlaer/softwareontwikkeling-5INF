
public class oef6_4_5 {
	public static void main(String[] args) {
		int jaar = 2006;
		int bevolking = 6500000;
		while (bevolking < 100000000) {
			jaar++;
			bevolking += bevolking * 0.012;
			System.out.println(jaar + "		" + bevolking);
		}
	}
}
