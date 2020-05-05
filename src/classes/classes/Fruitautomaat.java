package classes.classes;

public class Fruitautomaat {
    private int aantalAppels;
    private int aantalPeren;

    public Fruitautomaat() {
        this.aantalAppels = 0;
        this.aantalPeren = 0;
    }

    public Fruitautomaat(int aantalAppels, int aantalPeren) {
        this.aantalAppels = aantalAppels;
        this.aantalPeren = aantalPeren;
    }

    public void aanvullenAppels(int aantalExtraAppels) {
        this.aantalAppels += Math.abs(aantalExtraAppels);
    }

    public void aanvullenPeren(int aantalExtraPeren) {
        this.aantalPeren += Math.abs(aantalExtraPeren);
    }

    public void koopAppel() {
        if(this.aantalAppels > 0) this.aantalAppels--;
    }

    public void koopperen() {
        if(this.aantalPeren > 0) this.aantalPeren--;
    }

    public boolean uitverkochtAppels() {
        return this.getAantalAppels() <= 0;
    }

    public boolean uitverkochtPeren() {
        return this.getAantalPeren() <= 0;
    }

    //Getters And Setters
    public int getAantalAppels() {
        return aantalAppels;
    }

    public void setAantalAppels(int aantalAppels) {
        this.aantalAppels = aantalAppels;
    }

    public int getAantalPeren() {
        return aantalPeren;
    }

    public void setAantalPeren(int aantalPeren) {
        this.aantalPeren = aantalPeren;
    }
}
