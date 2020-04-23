package com.classes;

public class Array2D {
    private boolean[][] grid;

    public Array2D(int aantalKolommen, int aantalRijen) {
        grid = new boolean[aantalRijen][aantalKolommen];
    }

    public Array2D(int n) {
        grid = new boolean[n][n];
    }

    public int getAantal() {
        int size = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]) ++size;
            }
        }
        return size;
    }

    public int getAantalVanKolom(int kolom) {
        int size = 0;
        for (int i = 0; i < grid[kolom].length; i++) {
            if (grid[kolom][i]) ++size;
        }
        return size;
    }

    public int getAantalVanRrij(int rij) {
        int size = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][rij]) ++size;
        }
        return size;
    }

    public void verwisselKolommen(int kolom1, int kolom2) {
        boolean[] temp = this.grid[kolom1];
        this.grid[kolom1] = this.grid[kolom2];
        this.grid[kolom2] = temp;
    }

    public void verwisselRijen(int rij1, int rij2) {
        for (int i = 0; i < this.grid.length; i++) {
            boolean temp = this.grid[i][rij2];
            this.grid[i][rij2] = this.grid[i][rij1];
            this.grid[i][rij1] = temp;
        }
    }

    public boolean[] getDiagonaal() {
        if (this.grid.length != this.grid[0].length) return new boolean[0];
        boolean[] lijn = new boolean[this.grid.length];
        for (int i = 0; i < lijn.length; i++) {
            lijn[i] = this.grid[i][i];
        }
        return lijn;
    }

    public int getAantalWaardenRond(int x, int y) {
        int aantalWaarden = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newX = x + i;
                int newY = y + j;
                if ((newX >= 0 && newX < this.grid.length) &&
                        (newY >= 0 && newY < this.grid[0].length)) {
                    if (grid[newX][newY] && newX != 0 && newY != 0) ++aantalWaarden;
                }
            }
        }
        return aantalWaarden;
    }

    public boolean[][] getGrid() {
        return grid;
    }

    public boolean getValueOf(int x, int y) {
        if (!(x >= 0 && x < this.grid.length) ||
                !(y >= 0 && y < this.grid[0].length)) {
            throw new Error("Cannot get x (" + x + ") and y (" + y + ") of grid.\ngrid:\n\tWidth " + this.grid.length + "\n\tHeight " + this.grid[0].length);
        }

        return this.grid[x][y];
    }

    public int getWidth() {
        return this.grid.length;
    }

    public int getHeight() {
        return this.grid[0].length;
    }

    public void randomize() {
        for (int i = 0; i < this.grid.length; i++) {
            for (int j = 0; j < this.grid[0].length; j++) {
                this.setValueOf(i, j, Math.floor(Math.random() * 2) == 0);
            }
        }
    }

    public void setValueOf(int x, int y, boolean b) {
        this.grid[x][y] = b;
    }
}
