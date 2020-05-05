package com.classes;

public class CD {
    private String titel;
    private String uitvoerder;
    private int aantalLiedjes = 0;

    public CD(String titel, String uitvoerder) {
        this.titel = titel;
        this.uitvoerder = uitvoerder;
    }

    public void printDetails() {
        System.out.println("Titel: " + this.titel + "\nUitvoerder: " + this.uitvoerder + "\nAantal liedjes: " + this.aantalLiedjes);
    }

    public int getAantalLiedjes() {
        return aantalLiedjes;
    }

    public void setAantalLiedjes(int aantalLiedjes) {
        this.aantalLiedjes = aantalLiedjes;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getUitvoerder() {
        return uitvoerder;
    }

    public void setUitvoerder(String uitvoerder) {
        this.uitvoerder = uitvoerder;
    }
}