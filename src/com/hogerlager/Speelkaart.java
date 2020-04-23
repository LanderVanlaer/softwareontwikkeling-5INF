package com.hogerlager;

public class Speelkaart {
    private static final String[] waardenNaam = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "dame", "heer"};
    private static final String[] soortenNaam = {"klaver", "schoppen", "ruiten", "harten"};
    private static final String[] kleuren = {"zwart", "rood"};
    private static final int[] kleurenPerSoort = {0, 0, 1, 1};
    private int waarde;
    private int soort;

    public Speelkaart(String waarde, String soort) {
        this.setWaarde(getIntOfWaarde(waarde));
        this.setSoort(getIntOfSoort(soort));
    }

    public Speelkaart(int waarde, int soort) {
        this.setWaarde(waarde - 1);
        this.setSoort(soort - 1);
    }

    public Speelkaart() {
        this.setWaarde((int) Math.floor(Math.random() * waardenNaam.length));
        this.setSoort((int) Math.floor(Math.random() * soortenNaam.length));
    }


    public int getIntOfWaarde(String waarde) {
        int getal = -1;
        for(int i = 0; i < waardenNaam.length; i++) {
            if(waardenNaam[i].equalsIgnoreCase(waarde))
                getal = i;
        }
        if(getal > -1)
            return getal;
        else throw new Error("Geen juiste waarde meegekregen");
    }

    public int getIntOfSoort(String soort) {
        int getal = -1;
        for(int i = 0; i < soortenNaam.length; i++) {
            if(soortenNaam[i].equalsIgnoreCase(soort))
                getal = i;
        }
        if(getal > -1)
            return getal;
        else throw new Error("Geen juiste soort meegekregen");
    }

    private void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    private void setSoort(int soort) {
        this.soort = soort;
    }

    public boolean equal(Speelkaart kaart) {
        return kaart.getSoortIndex() == this.getSoortIndex() && kaart.getWaardeIndex() == this.getWaardeIndex();
    }

    public boolean waardeLessThen(Speelkaart kaart) {
        return kaart.getWaardeIndex() > this.getWaardeIndex();
    }

    public boolean waardeMoreThen(Speelkaart kaart) {
        return kaart.getWaardeIndex() < this.getWaardeIndex();
    }

    public int getSoortIndex() {
        return this.soort;
    }

    public int getWaardeIndex() {
        return this.waarde;
    }

    public int getSoortInt() {
        return getSoortIndex() + 1;
    }

    public int getWaardeInt() {
        return getWaardeIndex() + 1;
    }

    public String getSoortString() {
        return soortenNaam[this.getSoortIndex()];
    }

    public String getWaardeString() {
        return waardenNaam[this.getWaardeIndex()];
    }

    public String getKleurString() {
        return kleuren[this.getKleurIndex()];
    }

    public int getKleurIndex() {
        return kleurenPerSoort[this.getSoortIndex()];
    }
}
