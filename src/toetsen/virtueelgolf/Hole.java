package toetsen.virtueelgolf;

import classes.classes.Coordinates;

public class Hole {
    private int nummer;
    private Coordinates startPos;
    private Coordinates holePos;

    public Hole() {
        this(5, new Coordinates(150, 250), new Coordinates(1000, 600));
    }

    public Hole(int nummer, Coordinates startPos, Coordinates holePos) {
        this.nummer = nummer;
        this.startPos = startPos;
        this.holePos = holePos;
    }

    public void print() {
        System.out.println(this.getNummer() + ",\t start: (" + this.getStartPos().getX() + ", " + this.getStartPos().getY() + ")\n" +
                "hole: (" + this.getHolePos().getX() + ", " + this.getHolePos().getY() + ")");
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public Coordinates getStartPos() {
        return startPos;
    }

    public void setStartPos(Coordinates startPos) {
        this.startPos = startPos;
    }

    public Coordinates getHolePos() {
        return holePos;
    }

    public void setHolePos(Coordinates holePos) {
        this.holePos = holePos;
    }

    public double getAfstand() {
        return this.getStartPos().distance(this.getHolePos());
    }
}
