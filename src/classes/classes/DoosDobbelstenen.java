package com.classes;

public class DoosDobbelstenen {
    private Dobbelsteen[] dobbelstenen;

    public DoosDobbelstenen(int aantalDobbelstenen) {
        this.initializeDobbelstenen(aantalDobbelstenen);
    }

    public DoosDobbelstenen(int aantalDobbelstenen, int startNummer) {
        this.initializeDobbelstenen(aantalDobbelstenen, startNummer);
    }

    public static void main(String[] args) {
        DoosDobbelstenen doosDobbelstenen = new DoosDobbelstenen(6);
        for(int i = 0; i < 7; i++) {
            doosDobbelstenen.schudden();
            doosDobbelstenen.toonDobbelstenen();
            System.out.println("Aantal zessen:\t" + doosDobbelstenen.getAantalZessen());
        }
    }

    public int getAantalZessen() {
        int aantalZessen = 0;
        for(int i = 0; i < this.getAantalDobbelstenen(); i++)
            if(this.getDobbelsteen(i).getBovenLiggendNummer() == 6) ++aantalZessen;
        return aantalZessen;
    }

    public void initializeDobbelstenen(int aantalDobbelstenen) {
        this.dobbelstenen = new Dobbelsteen[aantalDobbelstenen];
        for(int i = 0; i < aantalDobbelstenen; i++) this.setDobbelsteen(i, new Dobbelsteen());
    }

    public void initializeDobbelstenen(int aantalDobbelstenen, int startnummer) {
        this.dobbelstenen = new Dobbelsteen[aantalDobbelstenen];
        for(int i = 0; i < aantalDobbelstenen; i++) this.setDobbelsteen(i, new Dobbelsteen(startnummer));
    }

    private void setDobbelsteen(int i, Dobbelsteen db) {
        this.dobbelstenen[i] = db;
    }

    public void schudden() {
        for(int i = 0; i < this.getAantalDobbelstenen(); i++)
            this.schudDobbelsteen(i);
    }

    public void schudDobbelsteen(int i) {
        this.getDobbelsteen(i).gooi();
    }

    public void toonDobbelstenen() {
        for(int i = 0; i < this.getAantalDobbelstenen(); i++)
            System.out.println(i + " :\t" + this.getDobbelsteen(i).getBovenLiggendNummer());
    }

    public Dobbelsteen getDobbelsteen(int i) {
        return this.getDobbelstenen()[i];
    }

    public int getAantalDobbelstenen() {
        return this.getDobbelstenen().length;
    }

    public Dobbelsteen[] getDobbelstenen() {
        return this.dobbelstenen;
    }
}
