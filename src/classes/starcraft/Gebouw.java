package classes.starcraft;

public class Gebouw {
    private static int kostprijsGas;
    private static int kostprijsMineralen;
    private String naam;
    private double levensbar;
    private double armor;
    private int aantalExtraPopulatie;

    public Gebouw(String naam, double levensbar, double armor, int aantalExtraPopulatie) {
        this.naam = naam;
        this.levensbar = levensbar;
        this.armor = armor;
        this.aantalExtraPopulatie = aantalExtraPopulatie;
    }

    public static int getKostprijsMineralen() {
        return kostprijsMineralen;
    }

    public static void setKostprijsMineralen(int kostprijsMineralen) {
        Gebouw.kostprijsMineralen = kostprijsMineralen;
    }

    public static int getKostprijsGas() {
        return kostprijsGas;
    }

    public static void setKostprijsGas(int kostprijsGas) {
        Gebouw.kostprijsGas = kostprijsGas;
    }

    public static boolean maakWerker(Speler speler, double levensbar, double speed) throws Exception {
        if(!speler.dropAantalMineralen(50))
            return false;
        System.out.println(speler.getNaam() + " is een werker aan het maken");
        Thread.sleep(15000);
        return speler.addWerker(new Werker("Werker", levensbar, speed));
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getLevensbar() {
        return levensbar;
    }

    public void setLevensbar(double levensbar) {
        this.levensbar = levensbar;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public int getAantalExtraPopulatie() {
        return aantalExtraPopulatie;
    }

    public void setAantalExtraPopulatie(int aantalExtraPopulatie) {
        this.aantalExtraPopulatie = aantalExtraPopulatie;
        if(this.getAantalExtraPopulatie() > 10) {
            this.setAantalExtraPopulatie(10);
        } else if(this.getAantalExtraPopulatie() <= 0) {
            this.setAantalExtraPopulatie(1);
        }
    }
}