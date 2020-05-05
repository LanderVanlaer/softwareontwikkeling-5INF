package classes.hogerlager;

import java.util.ArrayList;

public class BoekKaarten {
    private ArrayList<Speelkaart> boek = new ArrayList<>();

    public BoekKaarten() {
        for(int a = 1; a <= 13; a++) {
            for(int i = 1; i <= 4; i++) {
                boek.add(new Speelkaart(a, i));
            }
        }
    }

    public boolean contains(int waarde, int soort) {
        Speelkaart kaart = new Speelkaart(waarde, soort);
        return this.boek.contains(kaart);
    }

    public boolean contains(Speelkaart kaart) {
        return this.boek.contains(kaart);
    }

    public void remove(int waarde, int soort) {
        Speelkaart kaart = new Speelkaart(waarde, soort);
        this.removeKaart(kaart);
    }

    public void removeKaart(Speelkaart kaart) {
        if(this.contains(kaart)) {
            this.boek.remove(kaart);
        }
    }

    public Speelkaart getNieuweKaart() {
        Speelkaart kaart = boek.get((int) (this.boek.size() * Math.random()));
        removeKaart(kaart);
        return kaart;
    }

    public void schud() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < boek.size() - 1; j++) {
                if(Math.random() > .5) {
                    Speelkaart temp = boek.get(j);
                    boek.set(i, boek.get(i + 1));
                    boek.set(i + 1, temp);
                }
            }
        }
    }

    public void addKaart(Speelkaart kaart) {
        this.boek.add(kaart);
    }

    public int getLength() {
        return this.boek.size();
    }
}
