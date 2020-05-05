package classes.starcraft;

public class Werker {
    private String naam;
    private double levensbar;
    private double speed;
    private int aantalGrondstoffen = 0;

    public Werker(String naam, double levensbar, double speed) throws Exception {
        if(levensbar <= 0 || speed <= 0)
            throw new Exception("Slechte input waarden in constructor");
        this.naam = naam;
        this.levensbar = levensbar;
        this.speed = speed;
    }

    public void grondstoffenOpnemen(int aantalGrondstoffen) throws InterruptedException {
        Thread.sleep((long) (this.speed * 1000D));//3s wachten
        Grondstoffen.dropAantalGrondStoffen(aantalGrondstoffen);
        this.aantalGrondstoffen += aantalGrondstoffen;
    }

    public boolean bouw(Speler speler) throws InterruptedException {
        if(speler.getAantalMineralen() >= Gebouw.getKostprijsMineralen() && speler.getAantalGassen() >= Gebouw.getKostprijsGas()) {
            System.out.println(speler.getNaam() + " is een nieuw gebouw aan het maken");
            speler.dropAantalMineralen(Gebouw.getKostprijsMineralen());
            speler.dropAantalGassen(Gebouw.getKostprijsGas());
            Thread.sleep(30000);//30s bouwen
            speler.addGebouw(
                    new Gebouw(
                            "Building(" + speler.getNaam() + ")",
                            20,
                            10,
                            (int) (Math.random() * 5D + 5)));

            return true;
        } else
            return false;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
