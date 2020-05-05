package com.classes;

public class Cirkel {
    private double straal;

    public Cirkel() {
        this.straal = 10D;
    }

    public Cirkel(double straal) {
        this.straal = straal;
    }

    public double getOpp() {
        return Math.pow(this.straal, 2) * Math.PI;
    }

    public double getOmtrek() {
        return 2 * this.straal * Math.PI;
    }
}
