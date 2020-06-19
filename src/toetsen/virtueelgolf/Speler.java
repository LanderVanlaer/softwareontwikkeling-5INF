package toetsen.virtueelgolf;

import classes.classes.Coordinates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Speler {
    private String naam;
    private boolean geslacht;
    private int handicap;
    private List<Golfclub> golfclubs = new ArrayList<>();
    private List<Golfbal> golfballen = new ArrayList<Golfbal>();
    private Hole hole;

    public Speler(String naam, boolean geslacht, int handicap) {
        this.naam = naam;
        this.geslacht = geslacht;
        this.handicap = handicap;
    }

    public void runHole(Hole hole) {
        final int aantalGolfclubs = this.getGolfclubs().size();
        final int aantalGolfballen = this.getGolfballen().size();
        if(aantalGolfclubs < 2 || aantalGolfclubs > 13) {
            System.out.println("U heeft te " + (aantalGolfclubs < 2 ? "weinig" : "veel") + " golfclubs,\nhet aantal golfclubs moet tussen de 2 en 13 liggen, u hebt er " + aantalGolfclubs);
            return;
        }
        if(aantalGolfballen < 1) {
            System.out.println("U heeft te weinig golfballen,\nu moet minstens 1 golfbal hebben");
            return;
        }
        this.setHole(hole);
        this.getGolfballen().get(0).setPos(new Coordinates(hole.getStartPos()));
    }

    public void slaagOpBal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kies een golfclub om met te slagen:");
        for(int i = 0; i < golfclubs.size(); i++)
            System.out.println("\t" + i + " --> " + golfclubs.get(i).getMerk() + ", " + golfclubs.get(i).getSterkte());
        System.out.println();
        System.out.print("Geef de index: ");
        Golfclub golfclub = golfclubs.get(scan.nextInt());

        final double totaleAfwijking = Math.random() * 20D - 10D;
        final double afwijkingX = totaleAfwijking * Math.random();
        final double afwijkingY = totaleAfwijking - afwijkingX;

        final double percVanTotaleAfstand = golfclub.getSterkteSlag() / this.getHole().getAfstand();
        final int x = (int) (Math.round(hole.getHolePos().getX() - golfballen.get(0).getPos().getX()) * percVanTotaleAfstand + afwijkingX);
        final int y = (int) (Math.round(hole.getHolePos().getY() - golfballen.get(0).getPos().getY()) * percVanTotaleAfstand + afwijkingY);
        this.golfballen.get(0).setPos(new Coordinates(golfballen.get(0).getPos().getX() + x, golfballen.get(0).getPos().getY() + y));
    }

    public void print() {
        System.out.println("\nHole:");
        this.getHole().print();

        System.out.println("\nGolfbal:");
        this.getGolfballen().get(0).print();
        System.out.println("Naam: " + this.getNaam());
        System.out.println("Geslacht: " + (this.isGeslacht() ? "man" : "vrouw"));
    }

    public Hole getHole() {
        return hole;
    }

    private void setHole(Hole hole) {
        this.hole = hole;
    }

    public List<Golfbal> getGolfballen() {
        return golfballen;
    }

    public void setGolfballen(List<Golfbal> golfballen) {
        this.golfballen = golfballen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public boolean isGeslacht() {
        return geslacht;
    }

    public void setGeslacht(boolean geslacht) {
        this.geslacht = geslacht;
    }

    public int getHandicap() {
        return handicap;
    }

    public void setHandicap(int handicap) {
        this.handicap = handicap;
    }

    public List<Golfclub> getGolfclubs() {
        return golfclubs;
    }

    public void setGolfclubs(List<Golfclub> golfclubs) {
        this.golfclubs = golfclubs;
    }
}
