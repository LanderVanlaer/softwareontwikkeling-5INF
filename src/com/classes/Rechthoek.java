package com.classes;

public class Rechthoek {
    private double hoogte;
    private double basis;

    public Rechthoek(double basis, double hoogte) {
        this.hoogte = hoogte;
        this.basis = basis;
    }

    public double getHoogte() {
        return hoogte;
    }

    public void setHoogte(double hoogte) {
        this.hoogte = hoogte;
    }

    public double getBasis() {
        return basis;
    }

    public void setBasis(double basis) {
        this.basis = basis;
    }

    public double getOppervlakte() {
        return this.hoogte * this.basis;
    }
}