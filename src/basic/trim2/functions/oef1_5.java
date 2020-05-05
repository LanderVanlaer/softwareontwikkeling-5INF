package basic.trim2.functions;

public class oef1_5 {
    public static void main(String[] args) {
        double toevoegendBedrag = 800;
        double totaal = 0;
        for(int i = 0; i < 4; i++) {
            totaal = voegToe(totaal, toevoegendBedrag);
            System.out.println(totaal);
        }
    }

    public static double voegToe(double oorspronkelijkBedrag, double toevoegendBedrag) {
        return Math.round((1.005D * oorspronkelijkBedrag + toevoegendBedrag) * 100D) / 100D;
    }
}