package com.classes;

public class Bankrekening {
    private double totaal = 0;
    private double limiet = 0;
    private int aantalVerichtingen = 0;

    public Bankrekening(double limiet) {
        this.setLimiet(limiet);
    }

    public static void main(String[] args) {
        Bankrekening bankrekening = new Bankrekening(0);
        bankrekening.stort(500);
        bankrekening.afhalen(400);
        bankrekening.stort(10.5);
        bankrekening.afhalen(150);
    }

    public double stort(double stortBedrag) {
        double vorigBedrag = this.getTotaal();
        stortBedrag = Math.abs(stortBedrag);
        this.voegToeAanTotaal(stortBedrag);
        this.nieuweVerichting();
        this.printGelukt("Storting", vorigBedrag);
        return this.getTotaal();
    }

    public boolean afhalen(double afhaalBedrag) {
        afhaalBedrag = Math.abs(afhaalBedrag);
        double vorigBedrag = this.getTotaal();
        if(this.getTotaal() - afhaalBedrag >= this.getLimiet()) {
            //nog niet onder limiet
            this.haalAfVanTotaal(afhaalBedrag);
            this.nieuweVerichting();
            this.printGelukt("Afhaling", vorigBedrag);
            return true;
        } else {
            //Proberen onder limiet te gaan
            this.printNietGelukt("Afhaling");
            return false;
        }
    }

    private void printNietGelukt(String methode) {
        System.out.println(methode + ":");
        System.out.println("\t--> Er is iets misgelopen!\n\t--> Zit u niet onder uw limiet?");
        this.printAantalVerichtingen();
    }

    private void printAantalVerichtingen() {
        System.out.println("\t--> Aantal Verichtingen: " + this.getAantalVerichtingen());
    }

    private void printGelukt(String methode, double vorigBedrag) {
        System.out.println(methode + ":");
        System.out.println("\t--> vorig bedrag: €" + vorigBedrag);
        System.out.println("\t--> nieuw bedrag: €" + this.getTotaal());
        this.printAantalVerichtingen();
    }

    private void voegToeAanTotaal(double bedrag) {
        this.totaal += bedrag;
    }

    private void haalAfVanTotaal(double bedrag) {
        this.totaal -= bedrag;
    }

    private void nieuweVerichting() {
        this.aantalVerichtingen++;
    }

    //Getters and Setters
    public double getTotaal() {
        return totaal;
    }

    public double getLimiet() {
        return limiet;
    }

    public void setLimiet(double limiet) {
        this.limiet = limiet;
    }

    public int getAantalVerichtingen() {
        return aantalVerichtingen;
    }
}
