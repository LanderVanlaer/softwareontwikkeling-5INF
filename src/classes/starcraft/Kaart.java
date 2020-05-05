package classes.starcraft;

public class Kaart {
    private int lengte;
    private int breedte;
    private String naam;
    private int maxPlayers;
    private Grondstoffen[] mineralen = new Grondstoffen[24];
    private Grondstoffen[] gassen = new Grondstoffen[24];

    public Kaart(int lengte, int breedte, String naam, int maxPlayers) {
        this.lengte = lengte;
        this.breedte = breedte;

        this.naam = naam;
        this.maxPlayers = maxPlayers;

        for(int i = 0; i < mineralen.length; i++) {
            mineralen[i] = new Grondstoffen(1);
        }
        for(int i = 0; i < gassen.length; i++) {
            mineralen[i] = new Grondstoffen(1);
        }

    }

    public int getLengte() {
        return lengte;
    }

    public int getBreedte() {
        return breedte;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public Grondstoffen[] getMineralen() {
        return mineralen;
    }

    public Grondstoffen[] getGassen() {
        return gassen;
    }
}
