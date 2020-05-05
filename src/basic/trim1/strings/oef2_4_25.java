package basic.trim1.strings;

public class oef2_4_25 {
    public static void main(String[] args) {
        String product = "ketchup", zin;
        double prijs = 1.8, korting = .27;
        prijs -= korting;
        zin = prijs + " is de verkoopprijs van " + product;
        System.out.println(zin);
    }
}