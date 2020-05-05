package classes.classes;

import java.util.Scanner;

public class Levensspel {
    private Array2D grid;

    public Levensspel(int n) {
        this.grid = new Array2D(n);
        grid.randomize();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Levensspel spel = new Levensspel(8);
        while(!scan.next().equals("stop")) {
            spel.printGame();
            spel.nextGeneration();
        }
    }

    public void printGame() {
        for(int i = 0; i < grid.getWidth(); i++) {
            System.out.print("\t");
            for(int j = 0; j < grid.getHeight(); j++) {
                System.out.print((grid.getValueOf(i, j) ? "X" : ".") + "  ");
            }
            System.out.println();
        }
    }

    public void nextGeneration() {
        Array2D nieuwGrid = grid;
        for(int i = 0; i < grid.getWidth(); i++) {
            for(int j = 0; j < grid.getHeight(); j++) {
                int aantalWaardenRond = grid.getAantalWaardenRond(i, j);
                boolean value = grid.getValueOf(i, j);
                if(value) {
                    if(aantalWaardenRond > 3 || aantalWaardenRond < 2)
                        nieuwGrid.setValueOf(i, j, false);
                    else
                        nieuwGrid.setValueOf(i, j, true);
                } else {
                    if(aantalWaardenRond == 3)
                        nieuwGrid.setValueOf(i, j, true);
                }
            }
        }
    }
}
