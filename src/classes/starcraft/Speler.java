package classes.starcraft;

import java.util.ArrayList;

public class Speler {
    public static final String[] volken = new String[]{"terran", "protoss", "zerg"};
    private String naam;
    private int volkIndex;
    private int aantalMineralen = 0;
    private int aantalGassen = 0;
    private ArrayList<Werker> werkers = new ArrayList<Werker>();
    private ArrayList<Gebouw> gebouwen = new ArrayList<Gebouw>();
    private ArrayList<Unit> units = new ArrayList<Unit>();
    private int maxPopulatie = 10;

    public Speler(String naam) throws Exception {
        this.naam = naam;
        for(int i = 0; i < 6; i++) {
            this.addWerker(new Werker("Werker" + i, 100D, .5));//speed normaal 3
        }
    }

    public ArrayList<Gebouw> getGebouwen() {
        return gebouwen;
    }

    public boolean voegGebouwToe() throws InterruptedException {
        return this.getWerker((int) (Math.random() * this.getAantalWerkers())).bouw(this);
    }

    public void addGebouw(Gebouw gebouw) {
        this.gebouwen.add(gebouw);
    }

    public void haalMineralen() throws InterruptedException {
        int aantalGrondstoffen = 5;

        for(int i = 0; i < this.getAantalWerkers(); i++) {
            Werker werker = this.getWerker(i);
            System.out.println(werker.getNaam() + " haalt mineralen");
            werker.grondstoffenOpnemen(aantalGrondstoffen);
            System.out.println(werker.getNaam() + " is terug van het halen van mineralen");
            this.addAantalMineralen(aantalGrondstoffen);
        }
    }

    public void haalGassen() throws InterruptedException {
        int aantalGrondstoffen = 3;

        for(int i = 0; i < this.getAantalWerkers(); i++) {
            Werker werker = this.getWerker(i);
            System.out.println(werker.getNaam() + " haalt gassen");
            werker.grondstoffenOpnemen(aantalGrondstoffen);
            System.out.println(werker.getNaam() + " is terug van het halen van gassen");
            this.addAantalGassen(aantalGrondstoffen);
        }
    }

    public boolean nogLevend() {
        for(int i = 0; i < this.getUnits().size(); i++) {
            if(this.getUnit(i).getLevensbar() > 0)
                return true;
        }
        return false;
    }

    public Unit getUnit(int i) {
        return this.getUnits().get(i);
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit) {
        this.units.add(unit);
    }

    //grondstoffen
    public void addAantalMineralen(int aantalMineralen) {
        this.aantalMineralen += aantalMineralen;
    }

    public boolean dropAantalMineralen(int aantalMineralen) {
        if(this.getAantalMineralen() - aantalMineralen < 0) {
            return false;
        } else {
            this.aantalMineralen -= aantalMineralen;
            return true;
        }
    }

    public void addAantalGassen(int aantalGassen) {
        this.aantalGassen += aantalGassen;
    }

    public void dropAantalGassen(int aantalGassen) {
        this.aantalGassen -= aantalGassen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getVolkIndex() {
        return volkIndex;
    }

    public void setVolkIndex(int volkIndex) {
        this.volkIndex = volkIndex;
    }

    public int getAantalMineralen() {
        return aantalMineralen;
    }

    public void setAantalMineralen(int aantalMineralen) {
        this.aantalMineralen = aantalMineralen;
    }

    public int getAantalGassen() {
        return aantalGassen;
    }

    public void setAantalGassen(int aantalGassen) {
        this.aantalGassen = aantalGassen;
    }

    public boolean voegWerkerToe(double levensbar, double speed) throws Exception {
        return Gebouw.maakWerker(this, levensbar, speed);
    }

    public Werker getWerker(int i) {
        return this.getWerkers().get(i);
    }

    public int getAantalWerkers() {
        return this.getWerkers().size();
    }

    public boolean addWerker(Werker werker) {
        if(this.getAantalWerkers() == this.getMaxPopulatie())
            return false;
        else {
            this.werkers.add(werker);
            return true;
        }
    }

    public ArrayList<Werker> getWerkers() {
        return werkers;
    }

    public Gebouw getGebouw(int i) {
        return this.getGebouwen().get(i);
    }

    public int getMaxPopulatie() {
        int max = maxPopulatie;
        for(int i = 0; i < this.gebouwen.size(); i++) {
            max += this.getGebouw(i).getAantalExtraPopulatie();
        }
        return max;
    }

    public void setMaxPopulatie(int maxPopulatie) {
        this.maxPopulatie = maxPopulatie;
    }
}
