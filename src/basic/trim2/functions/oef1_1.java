package basic.trim2.functions;

public class oef1_1 {
    public static void main(String[] args) {
        System.out.println(beker(5, 10) + " cm²");
    }

    private static double beker(double r, double h) {
        return (Math.pow(r, 2) + r * h) * 6.823D;
    }
}
