package com.starcraft;

public class Grondstoffen {
    public static final String[] namen = new String[]{"Gas", "Minerals"};
    private static int aantalGrondStoffen = 20000;
    private int naamIndex;

    public Grondstoffen(int naamIndex) {
        this.naamIndex = naamIndex;
    }

    public static String[] getNamen() {
        return namen;
    }

    public static int getAantalGrondStoffen() {
        return aantalGrondStoffen;
    }

    public static void setAantalGrondStoffen(int aantalGrondStoffen) {
        Grondstoffen.aantalGrondStoffen = aantalGrondStoffen;
    }

    public static void addAantalGrondStoffen(int aantalGrondStoffen) {
        Grondstoffen.aantalGrondStoffen += aantalGrondStoffen;
    }

    public static void dropAantalGrondStoffen(int aantalGrondStoffen) {
        Grondstoffen.aantalGrondStoffen -= aantalGrondStoffen;
    }

    public int getNaamIndex() {
        return naamIndex;
    }

    public void setNaamIndex(int naamIndex) {
        this.naamIndex = naamIndex;
    }
}
