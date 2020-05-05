package classes.pokemon;

public class Aanval {
    private String naam;
    private double kracht;
    private int precisie; //0-100

    public Aanval(String naam, double kracht, int precisie) {
        this.naam = naam;
        this.kracht = kracht;
        this.precisie = precisie;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getKracht() {
        return kracht;
    }

    public void setKracht(double kracht) {
        this.kracht = kracht;
    }

    public int getPrecisie() {
        return precisie;
    }

    public void setPrecisie(int precisie) {
        this.precisie = precisie;
    }
}
