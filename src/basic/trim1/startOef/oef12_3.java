package basic.trim1.startOef;

public class oef12_3 {
    public static void main(String[] args) {
        double prijs, korting;
        int percent;
        prijs = 19.95;
        percent = 30;
        korting = ((double) percent / 100) * prijs;
        prijs -= korting;
        System.out.println(prijs);
    }

}
