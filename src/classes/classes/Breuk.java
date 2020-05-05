package com.classes;

public class Breuk {
    private int noemer;
    private int teller;

    public Breuk() {
        this.noemer = 1;
        this.teller = 2;
    }

    public Breuk(int noemer, int teller) {
        this.noemer = noemer;
        this.teller = teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public void setNoemer(int noemer) {
        this.noemer = noemer;
    }

    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public double quotent() {
        return (double) teller / (double) noemer;
    }
}

