package classes.pokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pokemon {
    private String naam;
    private int nummer;
    private String type;
    private boolean geslacht;
    private double levensbar;
    private double aanvalskracht;
    private ArrayList<Aanval> aanvallen = new ArrayList<Aanval>();
    private int verdediging;
    private int snelheid;

    public Pokemon(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        this.naam = scan.nextLine();
        this.nummer = scan.nextInt();
        scan.nextLine();
        this.type = scan.nextLine();

        String geslacht = scan.next();
        if(geslacht.equalsIgnoreCase("Man"))
            this.geslacht = true;
        else if(geslacht.equalsIgnoreCase("Vrouw"))
            this.geslacht = false;

        this.levensbar = scan.nextInt();
        this.verdediging = scan.nextInt();
        this.snelheid = scan.nextInt();
    }

    public Aanval vraagAanval() {
        System.out.println(this.getNaam() + ", kies een aanval:");

        for(int i = 0; i < this.getAanvallen().size(); i++) {
            Aanval aanval = this.getAanval(i);
            System.out.println(i + "\t" + aanval.getNaam());
            System.out.println("\t\tPrecisie:" + aanval.getPrecisie());
            System.out.println("\t\tKracht:" + aanval.getKracht());
        }

        Scanner scan = new Scanner(System.in);
        int antwoord = -1;

        boolean err = false;
        do {
            System.out.print("Geef de index van de aanval:\t");

            if(!scan.hasNextInt()) {
                System.out.println("Geen goed antwoord!");
                err = true;
                scan.nextLine();
                continue;
            }
            antwoord = scan.nextInt();
            if(!(antwoord < this.getAanvallen().size() && antwoord >= 0)) {
                System.out.println("Geen goede index");
                err = true;
                continue;
            }
            err = false;
        } while(err);

        return this.getAanval(antwoord);
    }

    public void addAanval(Aanval a) {
        this.aanvallen.add(a);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public boolean valAan(Pokemon aanvallendePokemon, Aanval aanval) {
        //precisie
        if(aanvallendePokemon.getAanvallen().contains(aanval)) {
            //Kijken of het raak is
            if(aanval.getPrecisie() > Math.floor(Math.random() * 100D)) {
                this.levensbar -= (aanvallendePokemon.getAanvalskracht() + aanval.getKracht()) - this.getVerdediging();
                //gelukt
                return true;
            }
        }
        //Niet gelukt
        return false;
    }

    public void verminderVerdediging(double kracht) {
        this.verdediging -= kracht;
        if(this.verdediging < 0D) {
            this.verdediging = 0;
        }
    }

    public void verminderLevensbar(double kracht) {
        this.levensbar -= kracht;
        if(this.levensbar < 0D) {
            this.levensbar = 0D;
        }
    }

    public Aanval getAanval(int i) {
        return this.getAanvallen().get(i);
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isGeslacht() {
        return geslacht;
    }

    public double getLevensbar() {
        return levensbar;
    }

    public void setLevensbar(double levensbar) {
        this.levensbar = levensbar;
    }

    public double getAanvalskracht() {
        return aanvalskracht;
    }

    public void setAanvalskracht(double aanvalskracht) {
        this.aanvalskracht = aanvalskracht;
    }

    public ArrayList<Aanval> getAanvallen() {
        return aanvallen;
    }

    public void setAanvallen(ArrayList<Aanval> aanvallen) {
        this.aanvallen = aanvallen;
    }

    public int getVerdediging() {
        return verdediging;
    }

    public void setVerdediging(int verdediging) {
        this.verdediging = verdediging;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(int snelheid) {
        this.snelheid = snelheid;
    }
}
