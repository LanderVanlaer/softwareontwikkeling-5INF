package toetsen.virtueelgolf;

public class Main {
    public static void main(String[] args) {
        Speler speler = new Speler("Jos Poef", true, 25);
        speler.getGolfclubs().add(new Golfclub());
        speler.getGolfclubs().add(new Golfclub("Golfeners x", 250));
        speler.getGolfballen().add(new Golfbal("Ballo G"));
        speler.runHole(new Hole());
        speler.print();

        for(int i = 0; i < 20; i++) {
            speler.slaagOpBal();
            speler.print();
        }
    }
}
