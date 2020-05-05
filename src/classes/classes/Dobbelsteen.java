package com.classes;

public class Dobbelsteen {
    private int bovenLiggendNummer;

    public Dobbelsteen() {
        gooi();
    }

    public Dobbelsteen(int bovenLiggendNummer) {
        this.setBovenLiggendNummer(bovenLiggendNummer);
    }

    public static void main(String[] args) {
        Dobbelsteen dobbelsteen = new Dobbelsteen();
        for(int i = 0; i < 2; i++) {
            dobbelsteen.gooi();
            System.out.println(dobbelsteen.getBovenLiggendNummer());
        }
    }

    public int draaiOm() {
        this.setBovenLiggendNummer(7 - this.getBovenLiggendNummer());
        return this.getBovenLiggendNummer();
    }

    public int gooi() {
        this.setBovenLiggendNummer(this.randomGetal());
        return this.getBovenLiggendNummer();
    }

    private int randomGetal() {
        return (int) ((Math.random() * 6) + 1);
    }

    public int getBovenLiggendNummer() {
        return this.bovenLiggendNummer;
    }

    public void setBovenLiggendNummer(int bovenLiggendNummer) {
        if(bovenLiggendNummer <= 6 && bovenLiggendNummer >= 1)
            this.bovenLiggendNummer = bovenLiggendNummer;
    }
}
