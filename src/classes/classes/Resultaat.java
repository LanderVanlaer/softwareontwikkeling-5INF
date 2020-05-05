package com.classes;

public class Resultaat {
    private static final String[] graden = new String[]{"Niet geslaagd", "Voldoende", "Onderscheiding", "Grote onderscheiding", "Grootste onderscheiding"};
    private double totaal;

    public Resultaat(double totaal) {
        this.totaal = totaal;
    }

    public String behaaldeGraad() {
        int i;
        if(totaal < .5)
            i = 0;
        else if(totaal < .68)
            i = 1;
        else if(totaal < .75)
            i = 2;
        else if(totaal < .85)
            i = 3;
        else
            i = 5;

        return graden[i];
    }

    public double getTotaal() {
        return totaal;
    }

    public void setTotaal(double totaal) {
        this.totaal = totaal;
    }
}
