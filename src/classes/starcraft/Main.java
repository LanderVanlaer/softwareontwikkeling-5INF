package classes.starcraft;

public class Main {
    public static void main(String[] args) throws Exception {
        Speler speler1 = new Speler("Jos");
        Speler speler2 = new Speler("Janne");
        Kaart kaart = new Kaart(2000, 2000, "Kaart", 2);

        speler1.addUnit(new Unit(100, 5, 30, 20, 2));
        speler2.addUnit(new Unit(60, 5, 30, 20, 2));

//        while(speler1.nogLevend() && speler2.nogLevend()) {
//            speler1.haalMineralen();
//            speler1.haalGassen();
//            speler2.haalMineralen();
//            speler2.haalGassen();
//            if(speler1.voegWerkerToe(Math.floor(Math.random() * 20D) + 10D, Math.floor(Math.random() * 3D) + 1.5))
//                System.out.println(speler1.getNaam() + " heeft een nieuwe werker");
//            if(speler2.voegWerkerToe(Math.floor(Math.random() * 20D) + 10D, Math.floor(Math.random() * 3D) + 1.5))
//                System.out.println(speler2.getNaam() + " heeft een nieuwe werker");
//
//            if(speler1.voegGebouwToe())
//                System.out.println(speler1.getNaam() + " heeft een nieuw gebouw");
//            if(speler2.voegGebouwToe())
//                System.out.println(speler1.getNaam() + " heeft een nieuw gebouw");
//        }
        System.out.println("gevecht gestart");
        speler1.getUnit(0).attack(speler2.getUnit(0));
        if(speler1.getUnit(0).getLevensbar() == 0) {
            System.out.println(speler2.getNaam() + " is gewonnen");
        }
        if(speler2.getUnit(0).getLevensbar() == 0) {
            System.out.println(speler1.getNaam() + " is gewonnen");
        }
    }
}
