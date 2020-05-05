
public class oef1_4 {
	public static void main(String[] args) {
		double bmi = bmi(61, 170);
		System.out.println(String.format("Een persoon met een bmi van %f is %s", bmi, gezond(bmi)));
	}

	private static double bmi(double gewicht, double lengte) {
		return gewicht / Math.pow(lengte / 100D, 2);
	}

	private static String gezond(double bmi) {
		return bmi > 25 ? "te hoog" : bmi < 19 ? "te laag" : "gezond";
	}
}
