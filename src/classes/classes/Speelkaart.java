package classes.classes;

public class Speelkaart {
    private static String[] waardenNaam = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "dame", "heer"};
    private static String[] soortenNaam = {"klaver", "schoppen", "ruiten", "harten"};
    private static String[] kleuren = {"zwart", "rood"};
    private static int[] kleurenPerSoort = {0, 0, 1, 1};
    private int waarde;
    private int soort;

    public Speelkaart(String waarde, String soort) {
        this.waarde = getIntOfWaarde(waarde);
        this.soort = getIntOfSoort(soort);
    }

    public Speelkaart(int waarde, int soort) {
        this.waarde = --waarde;
        this.soort = --soort;
    }

    public Speelkaart() {
        this.waarde = (int) Math.floor(Math.random() * waardenNaam.length);
        this.soort = (int) Math.floor(Math.random() * soortenNaam.length);
    }

    public static void main(String[] args) {
        Speelkaart kaart = new Speelkaart();
        System.out.println(kaart.getSoortString() + "\t" + kaart.getWaardeString() + "\t" + kaart.getKleurString());
    }

    public int getIntOfWaarde(String waarde) {
        int getal = -1;
        for(int i = 0; i < waardenNaam.length; i++) {
            if(waardenNaam[i].equalsIgnoreCase(waarde))
                getal = i;
        }
        if(getal > -1)
            return getal;
        else throw new Error("Geen juiste waarde meegekregen");
    }

    public int getIntOfSoort(String soort) {
        int getal = -1;
        for(int i = 0; i < soortenNaam.length; i++) {
            if(soortenNaam[i].equalsIgnoreCase(soort))
                getal = i;
        }
        if(getal > -1)
            return getal;
        else throw new Error("Geen juiste soort meegekregen");
    }

    public boolean equal(Speelkaart kaart) {
        return kaart.soort == this.soort && kaart.waarde == this.waarde;
    }

    public boolean waardeLessThen(Speelkaart kaart) {
        return kaart.waarde > this.waarde;
    }

    public boolean waardeMoreThen(Speelkaart kaart) {
        return kaart.waarde < this.waarde;
    }

    public int getSoortIndex() {
        return soort;
    }

    public int getWaardeIndex() {
        return waarde;
    }

    public int getSoortInt() {
        return getSoortIndex() + 1;
    }

    public int getWaardeInt() {
        return getWaardeIndex() + 1;
    }

    public String getSoortString() {
        return soortenNaam[this.soort];
    }

    public String getWaardeString() {
        return waardenNaam[this.waarde];
    }

    public String getKleurString() {
        return kleuren[getKleurIndex()];
    }

    public int getKleurIndex() {
        return kleurenPerSoort[soort];
    }
}
