package basic.trim1.strings;

public class oef2_5_2 {
    public static void main(String[] args) {
        String zin;
        int r = 70, a = 16;
        int goedeHartslag = (int) Math.round(0.7D * (220D - ((double) a)) + 0.3D * ((double) r));
        zin = "Je training pols is " + goedeHartslag;
        System.out.println(zin);
    }
}