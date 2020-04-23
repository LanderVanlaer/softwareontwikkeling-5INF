package com.pokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {
    private String naam;
    private boolean geslacht;
    private int aantalBadges;
    private double geld;
    private ArrayList<Pokemon> pokemons;
    private ArrayList<Pokemon> pokemonsInventaris;

    public Trainer(String naam, boolean geslacht) {
        this.naam = naam;
        this.geslacht = geslacht;
        pokemons = new ArrayList<Pokemon>();
        pokemonsInventaris = new ArrayList<Pokemon>();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Trainer trainer1 = new Trainer("Jos", true);
        Trainer trainer2 = new Trainer("Ivo", false);

        Pokemon pokemon1 = new Pokemon(new File("pokemon.txt"));
        pokemon1.addAanval(new Aanval("Zand", 15, 50));
        trainer1.addPokemonInventaris(pokemon1);

        Pokemon pokemon2 = new Pokemon(new File("pokemon.txt"));
        pokemon2.addAanval(new Aanval("Pepsi", 50, 80));
        trainer2.addPokemonInventaris(pokemon2);

        trainer2.daagUit(trainer1);
    }

    public void daagUit(Trainer trainer) {
        Pokemon pokemonTrainer1 = vraagPokemon();
        Pokemon pokemonTrainer2 = trainer.vraagPokemon();
        int aanDeBeurt = 1;
        if(pokemonTrainer1.getSnelheid() < pokemonTrainer2.getSnelheid())
            aanDeBeurt++;
        while(pokemonTrainer1.getLevensbar() >= 0 && pokemonTrainer2.getLevensbar() >= 0) {
            //Aanvallen

            System.out.println("\n----------------------------------------------------------");
            System.out.println(this.getNaam() + ",");
            System.out.println("\tHP: " + pokemonTrainer1.getLevensbar());
            System.out.println("\tVerdediging: " + pokemonTrainer1.getVerdediging());

            System.out.println("\n" + trainer.getNaam() + ",");
            System.out.println("\tHP: " + pokemonTrainer2.getLevensbar());
            System.out.println("\tVerdediging: " + pokemonTrainer2.getVerdediging());


            Aanval aanval;
            boolean gelukt;
            if(aanDeBeurt % 2 != 0) {
                System.out.println("\n" + this.getNaam());
                aanval = pokemonTrainer1.vraagAanval();
                gelukt = pokemonTrainer2.valAan(pokemonTrainer1, aanval);
            } else {
                System.out.println("\n" + trainer.getNaam());
                aanval = pokemonTrainer2.vraagAanval();
                gelukt = pokemonTrainer1.valAan(pokemonTrainer2, aanval);
            }
            aanDeBeurt++;
            if(gelukt)
                System.out.println("\n\t\t__________________RAAK__________________");
            else
                System.out.println("\n\t\t__________________MIS__________________");
        }
        //1 van de 2 pokemons is dood
        System.out.println("\n\n\nPOKEMON GESTORVEN!!!");
        if(pokemonTrainer1.getLevensbar() <= 0) {
            int stillPossible = 0;
            for(int i = 0; i < this.getPokemonsInventaris().size(); i++)
                if(this.getPokemonInventaris(i).getLevensbar() >= 0) ++stillPossible;
            if(stillPossible == 0)
                return;


            System.out.println("Pokemon: " + pokemonTrainer1.getNaam() + ". Van: " + this.getNaam());
            this.daagUit(trainer);
        } else if(pokemonTrainer2.getLevensbar() <= 0) {
            int stillPossible = 0;
            for(int i = 0; i < trainer.getPokemonsInventaris().size(); i++)
                if(trainer.getPokemonInventaris(i).getLevensbar() >= 0) ++stillPossible;
            if(stillPossible == 0)
                return;

            System.out.println("Pokemon: " + pokemonTrainer2.getNaam() + ". Van: " + trainer.getNaam());
            trainer.daagUit(this);
        }
    }

    public Pokemon vraagPokemon() {
        Scanner scan = new Scanner(System.in);


        System.out.println(this.getNaam() + ", kies een pokemon:");

        for(int i = 0; i < this.getPokemonsInventaris().size(); i++) {
            Pokemon pokemon = this.getPokemonInventaris(i);
            if(pokemon.getLevensbar() <= 0) {
                System.out.println(i + "\t" + pokemon.getNaam() + "\t" + pokemon.getType() + "Unable To pick");
            } else {
                System.out.println(i + "\t" + pokemon.getNaam() + "\t" + pokemon.getType());
            }
        }

        int antwoord = -1;

        boolean err = false;
        do {
            System.out.print("Geef de index van de pokemon:\t");
//            String ans  = scan.next();
            antwoord = scan.nextInt();

//            if(!ans.chars().allMatch(Character::isDigit)) {
//                System.out.println("Geen goed antwoord!");
//                err = true;
//                continue;
//            }

//            antwoord = Integer.parseInt(ans);

            if(!(antwoord < this.getPokemonsInventaris().size() && antwoord >= 0)) {
                System.out.println("Geen goede index");
                err = true;
                continue;
            }
            if(this.getPokemonInventaris(antwoord).getLevensbar() <= 0) {
                System.out.println("Pokemon heeft geen levens meer");
                err = true;
                continue;
            }
            err = false;
        } while(err);

        return this.getPokemonInventaris(antwoord);
    }

    public Pokemon getRandomPokemon() {
        return this.getPokemonInventaris((int) (Math.random() * pokemonsInventaris.size()));
    }

    public Pokemon getPokemonInventaris(int i) {
        return this.getPokemonsInventaris().get(i);
    }

    public void addBadge() {
        this.aantalBadges++;
    }

    public void addPokemonInventaris(Pokemon pokemon) {
        if(pokemonsInventaris.size() < 6)
            this.pokemonsInventaris.add(pokemon);
        else throw new Error("Max Pokemons in inventaris is 6");
    }

    public Pokemon removePokemonInventaris(int index) {
        if(index < 1 || index >= pokemonsInventaris.size())
            throw new Error("Index " + index +
                    " niet mogelijk van een lengte van " + pokemonsInventaris.size());
        if(pokemonsInventaris.size() == 1)
            throw new Error("Minimum 1 pokemon in Inventaris");
        return pokemonsInventaris.remove(index);
    }

    public boolean removePokemonInventaris(Pokemon pokemon) {
        return this.pokemonsInventaris.remove(pokemon);
    }

    //-----------------------------------------------getters-----------------------------------------------
    public String getNaam() {
        return naam;
    }

    public boolean isGeslacht() {
        return geslacht;
    }

    public int getAantalBadges() {
        return aantalBadges;
    }

    public double getGeld() {
        return geld;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public ArrayList<Pokemon> getPokemonsInventaris() {
        return pokemonsInventaris;
    }
}
